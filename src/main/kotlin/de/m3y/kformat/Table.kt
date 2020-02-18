package de.m3y.kformat

import de.m3y.kformat.Table.BorderStyle.Companion.NONE
import de.m3y.kformat.Table.BorderStyle.Companion.SINGLE_LINE
import java.time.LocalDateTime
import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.max

/**
 * Provides a DSL for simple table formatted text output.
 *
 *  * A table consists of one (optional) header and a list of rows
 *  * Rendering formats row values, using optional hints for precision or alignment
 *  * Rendering autosizes cell widths
 *
 *  Example:
 *  ```kotlin
 *  table {
 *      header("A", "B", "C", "Long_Header")
 *
 *      row(10, "b...1", 2.1f, "foo")
 *      row(20, "b2", 1 / 3f, "bar")
 *
 *      hints {
 *          alignment("A", Hints.Alignment.LEFT)
 *          precision("C", 2)
 *          postfix("C", "%")
 *      }
 *  }.render(StringBuilder())
 *  ```
 *  produces
 *  ```
 *  A      B     C Long_Header
 *  10 b...1 2.10%         foo
 *  20    b2 0.33%         bar
 *  ```
 */
class Table internal constructor() {
    /**
     * Renders a border.
     */
    interface BorderRenderer {
        fun hasColumnSeparator(): Boolean
        fun hasRowSeparator(): Boolean
        fun renderVertical(out: StringBuilder)
        fun renderHorizontal(out: StringBuilder)
        fun renderConnect(out: StringBuilder)
    }

    /**
     * Renders borders with [NONE] and [SINGLE_LINE] implementations for a table.
     */
    open class BorderStyle(
        private val columnSeparator: String,
        private val rowSeparator: String,
        private val connectSeparator: String = columnSeparator
    ) : BorderRenderer {
        companion object {
            /** Renders no border.*/
            val NONE = BorderStyle(" ", "")
            /** Renders a single line border. */
            val SINGLE_LINE = BorderStyle(" | ", "-", "-|-")
        }

        override fun hasColumnSeparator() = columnSeparator.isNotEmpty()
        override fun hasRowSeparator() = rowSeparator.isNotEmpty()

        override fun renderVertical(out: StringBuilder) {
            out.append(columnSeparator)
        }

        override fun renderHorizontal(out: StringBuilder) {
            out.append(rowSeparator)
        }

        override fun renderConnect(out: StringBuilder) {
            out.append(connectSeparator)
        }
    }

    /**
     * Represents a table row of values.
     */
    open inner class Row(
        val
        /** The values in this row. Can be used for dynamically appending additional values. */
        values: MutableList<Any>
    ) {
        /**
         * Renders the row values using provided value format specifiers
         */
        open fun render(
            out: StringBuilder,
            formatSpecs: List<String>,
            widths: IntArray
        ) {
            hints.leftMargin()?.also { out.append(it) }

            widths.forEachIndexed { i, w ->
                if (i > 0) {
                    hints.borderStyle.renderVertical(out)
                }
                if (i < values.size) {
                    val columnValue = values[i]
                    try {
                        out.append(formatSpecs[i].format(columnValue))
                    } catch (e: java.util.IllegalFormatConversionException) {
                        throw IllegalArgumentException(
                            "Can not format value '$columnValue' of type '${columnValue.javaClass} 'using " +
                                    "format spec '${formatSpecs[i]}'",
                            e
                        )
                    }
                } else {
                    out.append("%${w}s".format(" "))
                }
            }

            out.append(System.lineSeparator()) // Row ends with end-of-line
        }

        override fun toString(): String {
            return "Row(values=$values)"
        }
    }

    /**
     * A line is a special row containing a single value which spans all columns and renders without formatting.
     */
    inner class Line(value: String) : Row(mutableListOf(value)) {
        override fun render(
            out: StringBuilder,
            formatSpecs: List<String>,
            widths: IntArray
        ) {
            out.append(values.first())
                .append(System.lineSeparator()) // Line ends with end-of-line
        }
    }

    /**
     * Holds additional hints for rendering cells, such as cell content alignment.
     */
    class Hints(
        private val table: Table,
        /** Defines the default horizontal cell alignemnt */
        var defaultAlignment: Alignment = Alignment.RIGHT,
        /** Defines the border style */
        var borderStyle: BorderRenderer = NONE
    ) {
        /** Defines the content alignment. */
        enum class Alignment {
            /** Align to the left */
            LEFT,
            /** Align to the right */
            RIGHT
        }

        /**
         * Defines the (internal) hint keys.
         *
         * KeyFormat ::= ColumnFormat ':' KeyName
         * ColumnFormat ::= Integer | '*'
         * KeyName ::= 'alignment'| ....
         */
        enum class Key {
            Alignment,
            LeftMargin,
            Line,
            Postfix,
            Precision,
            Prefix;

            private fun makeKey(part: String) = "$part:$name"
            fun ofColumn(columnIndex: Int) = makeKey(columnIndex.toString())
            fun ofAnyColumn() = makeKey("*")
        }

        internal val specification = mutableMapOf<String, Any>()

        /**
         * Defines the alignment of a column specified by the header label.
         */
        fun alignment(headerLabel: String, alignment: Alignment) {
            val index = columnIndex(headerLabel)
            alignment(index, alignment)
        }

        /**
         * Defines the alignment of a column specified by the header column index.
         */
        fun alignment(headerColumnIndex: Int, alignment: Alignment) {
            updateSpecification(Key.Alignment.ofColumn(headerColumnIndex), alignment)
        }

        internal fun alignmentFormat(columnIndex: Int): String {
            return when (getSpecification(Key.Alignment.ofColumn(columnIndex)) as Alignment? ?: defaultAlignment) {
                Alignment.RIGHT -> ""
                Alignment.LEFT -> "-"
            }
        }

        /**
         * Defines the floating point precision of a column specified by the header label.
         */
        fun precision(headerLabel: String, value: Int) {
            val index = columnIndex(headerLabel)
            precision(index, value)
        }

        /**
         * Defines the floating point precision of a column specified by the header column index.
         */
        fun precision(columnIndex: Int, value: Int) {
            updateSpecification(Key.Precision.ofColumn(columnIndex), value)
        }

        internal fun precision(columnIndex: Int) =
            getSpecification(Key.Precision.ofColumn(columnIndex)) as Int? ?: 0

        internal fun precisionFormat(columnIndex: Int): String {
            val p = getSpecification(Key.Precision.ofColumn(columnIndex))
            return if (p != null) {
                "." + p
            } else {
                ""
            }
        }

        /**
         * Defines a postfix for a column specified by the header label.
         */
        fun postfix(headerLabel: String, postfix: String) {
            postfix(columnIndex(headerLabel), postfix)
        }

        /**
         * Defines a postfix for a column specified by the column index.
         *
         * @param columnIndex the columnIndex, starting at 0
         * @param postfix the value to be postfixed to each row value and given column index.
         */
        fun postfix(columnIndex: Int, postfix: String) {
            updateSpecification(Key.Postfix.ofColumn(columnIndex), postfix)
        }

        /**
         * Gets the postfix for given column, or an empty string if not set.
         *
         * @param columnIndex the columnIndex, starting at 0
         * @return the postfix value or empty string (if not set)
         */
        fun postfix(columnIndex: Int) = (getSpecification(Key.Postfix.ofColumn(columnIndex)) as String?) ?: ""


        internal fun postfixLengthIncrement(columnIndex: Int): Int = postfix(columnIndex).length

        /**
         * Defines a prefix for a column specified by the header label.
         *
         * @param headerLabel the header label specifying a column
         * @param prefix the value to be prefixed for each row value and given column index.
         */
        fun prefix(headerLabel: String, prefix: String) {
            prefix(columnIndex(headerLabel), prefix)
        }

        /**
         * Defines a prefix for a column specified by the column index.
         *
         * @param columnIndex the columnIndex, starting at 0
         * @param prefix the value to be prefixed for each row value and given column index.
         */
        fun prefix(columnIndex: Int, prefix: String) {
            updateSpecification(Key.Prefix.ofColumn(columnIndex), prefix)
        }

        /**
         * Gets the prefix value for given column.
         *
         * @return the prefix value or empty.
         */
        fun prefix(columnIndex: Int) = (getSpecification(Key.Prefix.ofColumn(columnIndex)) as String?) ?: ""
        internal fun prefixLengthIncrement(columnIndex: Int): Int = prefix(columnIndex).length

        /**
         * Prepends the margin value for each output row.
         * Can be used to eg indent a table.
         *
         * @param margin the margin value
         */
        fun leftMargin(margin: String) {
            updateSpecification(Key.LeftMargin.ofAnyColumn(), margin)
        }

        /**
         * Gets the left margin value used for indenting rendered table.
         */
        fun leftMargin() = getSpecification(Key.LeftMargin.ofAnyColumn()) as String?

        internal fun line(columnIndex: Int) {
            updateSpecification(Key.Line.ofColumn(columnIndex), "")
        }

        internal fun isLine(columnIndex: Int) = specification.containsKey(Key.Line.ofColumn(columnIndex))

        /**
         * Gets the column index for a header label.
         *
         * Throws an IllegalArgumentException if no label can be found.
         *
         * @param headerLabel the label value of a header column.
         * @return the column index of the first matching header column
         */
        private fun columnIndex(headerLabel: String): Int {
            // TODO: Switch to map<idx,label> ?
            table.headerLabels.forEachIndexed { index, s -> if (s == headerLabel) return index }
            throw java.lang.IllegalArgumentException("Can not find header label $headerLabel in ${table.headerLabels}")
        }

        private fun getSpecification(key: String) = specification[key]

        private fun updateSpecification(key: String, value: Any) {
            specification[key] = value
        }

        internal operator fun plus(providedSpec: Map<String, Any>): Hints {
            specification.putAll(providedSpec)
            return this
        }

        internal operator fun plus(keyValue: Pair<String, Any>): Hints {
            specification[keyValue.first] = keyValue.second
            return this
        }
    }

    private val headerLabels = mutableListOf<String>()
    private val hints = Hints(this)
    private val rows: MutableList<Row> = mutableListOf()

    /**
     * Renders the content as a table.
     *
     * @param out the string builder receiving the rendering output
     * @return the builder, for convenience
     */
    fun render(out: StringBuilder = StringBuilder()): StringBuilder {
        val widths = widths()
        val columnFormats = computeColFormats(widths)

        renderHeader(out, widths)
        rows.forEach { row ->
            row.render(out, columnFormats, widths)
        }
        return out
    }

    /**
     * Sets the header labels.
     *
     * @return the list of labels.
     */
    fun header(vararg labels: String): MutableList<String> {
        headerLabels.addAll(labels)
        return headerLabels
    }

    /**
     * Sets the header labels.
     *
     * @return the list of labels.
     */
    fun header(labels: List<String>): MutableList<String> {
        headerLabels.addAll(labels)
        return headerLabels
    }

    /**
     * Gets the label of the header at given index.
     *
     * @param columnIndex header label index
     * @return the label or index  out of bounds exception
     */
    fun header(columnIndex: Int) = headerLabels[columnIndex]

    /**
     * Sets the content values of a row.
     *
     * @param values the row content values.
     */
    fun row(vararg values: Any): Row {
        val row = Row(values.toMutableList())
        rows.add(row)
        return row
    }

    /**
     * DSL builder helper for hints.
     */
    fun hints(init: Hints.() -> Unit): Hints {
        hints.init()
        return hints
    }

    /**
     * DSL builder helper for hints.
     *
     * @param providedSpec some default render specification values
     */
    fun hints(providedSpec: Map<String, Any>, init: Hints.() -> Unit): Hints {
        hints(init) + providedSpec
        return hints
    }

    private fun widths(): IntArray {
        val maxColumns = max(rows.map { it.values.size }.max() ?: 0, headerLabels.size)
        // Headers can be empty (not set)
        val w = IntArray(maxColumns)
        headerLabels.forEachIndexed { i, s -> w[i] = s.length }
        rows.forEachIndexed { rowIndex, r ->
            if (!hints.isLine(rowIndex)) {
                r.values.forEachIndexed { i, v ->
                    // Headers can be not set
                    val valueExtraLength = extraFormattedValueLength(i)
                    w[i] = max(
                        w[i],
                        when (v) {
                            is CharSequence -> v.length
                            is Int -> length(v.toDouble())
                            is Float -> length(v.toDouble(), hints.precision(i))
                            is Double -> length(v, hints.precision(i))
                            is LocalDateTime -> v.toString().length
                            else -> {
                                throw IllegalStateException("Value '$v' of type '${v.javaClass}' in row[$i] not supported")
                            }
                        } + valueExtraLength
                    )
                }
            }
        }
        return w
    }

    private fun length(d: Double, precision: Int) =
        if (precision > 0) {
            ("%." + precision + "f")
        } else {
            "%f"
        }.format(d).length

    private fun extraFormattedValueLength(columnIndex: Int): Int =
        hints.postfixLengthIncrement(columnIndex) +
                hints.prefixLengthIncrement(columnIndex)

    private fun length(d: Double): Int {
        val da = abs(d)
        val r = if (d < 0) 1 else 0
        return if (da < 10) {
            r + 1
        } else {
            r + log10(da).toInt() + 1
        }
    }

    /**
     * Returns true if table contains at least one 'data' row.
     *
     * Note: A 'line(...)' does not count as a row.
     *
     * @return true if any row is a data row.
     */
    fun hasRows(): Boolean {
        for (i in rows.indices) {
            if (!hints.isLine(i)) return true
        }
        return false
    }

    private fun computeColFormats(widths: IntArray): List<String> {
        val columnFormats = mutableListOf<String>()
        if (hasRows()) { // Only compute widths if formatted rows exist. 'line' row is not formatted.
            val exampleRow = findExampleRow()
            exampleRow.values.forEachIndexed { columnIndex, v ->
                val formatSpec = StringBuffer()

                // Prefix
                val prefix = hints.prefix(columnIndex)
                if (prefix.isNotEmpty()) {
                    formatSpec.append(prefix)
                }

                val alignment = hints.alignmentFormat(columnIndex)
                formatSpec.append("%")
                    .append(alignment)
                    .append(
                        widths[columnIndex] - hints.prefixLengthIncrement(columnIndex) - hints.postfixLengthIncrement(
                            columnIndex
                        )
                    )
                when (v) {
                    is CharSequence -> formatSpec.append("s")
                    is Int -> formatSpec.append("d")
                    is Float, is Double -> formatSpec.append(getPrecisionFormat(columnIndex)).append("f")
                    // 2019-10-25T10:03:13.000+02:00
                    is LocalDateTime -> formatSpec.append("s")
                    else -> {
                        throw IllegalArgumentException(
                            "Unsupported value '$v' of type '${v.javaClass}' in row[$columnIndex]"
                        )
                    }
                }

                // Postfix
                val postfix = hints.postfix(columnIndex)
                if (postfix.isNotEmpty()) {
                    formatSpec.append(escapeForFormat(postfix))
                }

                columnFormats += formatSpec.toString()
            }
        }
        return columnFormats
    }

    private fun findExampleRow(): Row {
        rows.forEachIndexed { index, row ->
            if (!hints.isLine(index)) return row
        }
        throw java.lang.IllegalStateException("No row found in $rows that is not an unformatted 'line'")
    }


    private fun escapeForFormat(s: String) =
        s.replace("%", "%%")

    private fun getPrecisionFormat(columnIndex: Int) =
        hints.precisionFormat(columnIndex)

    private fun renderHeader(out: StringBuilder, widths: IntArray) {
        if (headerLabels.isEmpty()) {
            return
        }

        hints.leftMargin()?.also { out.append(it) }

        for(i in widths.indices) {
            if (i > 0) {
                hints.borderStyle.renderVertical(out)
            }

            val headerLabel =
                if (i < headerLabels.size) headerLabels[i] else " " // Use empty labels for missing labels
            out.append(("%" + hints.alignmentFormat(i) + widths[i] + "s").format(headerLabel))
        }

        if (hints.borderStyle.hasRowSeparator()) {
            out.append(System.lineSeparator())
            hints.leftMargin()?.also { out.append(it) }
            widths.forEachIndexed { index, w ->
                if (index > 0) {
                    hints.borderStyle.renderConnect(out)
                }
                repeat(w) {
                    hints.borderStyle.renderHorizontal(out)
                }
            }
        }
        out.append(System.lineSeparator())
    }

    /**
     * Adds an unformatted row (aka line).
     *
     * @param content the unformatted row value.
     */
    fun line(content: String): Row {
        hints.line(rows.size)
        val row = Line(content)
        rows.add(row)
        return row
    }
}

/**
 * Starts building a table.
 *
 * Usage:
 *  ```kotlin
 *  table {
 *      header("A", "B", "C")
 *      row(10, "some text value", 2.1f)
 *      ...
 *  }.render(StringBuilder())
 *  ```
 */
fun table(init: Table.() -> Unit): Table {
    val table = Table()
    table.init()
    return table
}
