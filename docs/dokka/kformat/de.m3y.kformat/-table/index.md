[kformat](../../index.md) / [de.m3y.kformat](../index.md) / [Table](./index.md)

# Table

`class Table`

Provides a DSL for simple table formatted text output.

* A table consists of one (optional) header and a list of rows
* Rendering formats row values, using optional hints for precision or alignment
* Rendering auto-sizes cell widths

Example:

``` kotlin
table {
    header("A", "B", "C", "Long_Header")

    row(10, "b...1", 2.1f, "foo")
    row(20, "b2", 1 / 3f, "bar")

    hints {
        alignment("A", Hints.Alignment.LEFT)
        precision("C", 2)
        postfix("C", "%")
    }
}.render(StringBuilder())
```

produces

```
A      B     C Long_Header
10 b...1 2.10%         foo
20    b2 0.33%         bar
```

### Types

| Name | Summary |
|---|---|
| [BorderRenderer](-border-renderer/index.md) | Renders a border.`interface BorderRenderer` |
| [BorderStyle](-border-style/index.md) | Renders borders with [NONE](-border-style/-n-o-n-e.md) and [SINGLE_LINE](-border-style/-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table.`class BorderStyle : BorderRenderer` |
| [Hints](-hints/index.md) | Holds additional hints for rendering cells, such as cell content alignment.`class Hints` |
| [Line](-line/index.md) | A line is a special row containing a single value which spans all columns and renders without formatting.`inner class Line : Row` |
| [Row](-row/index.md) | Represents a table row of values.`inner class Row` |

### Functions

| Name | Summary |
|---|---|
| [hasRows](has-rows.md) | Returns true if table contains at least one 'data' row.`fun hasRows(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [header](header.md) | Sets the header labels.`fun header(vararg labels: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun header(labels: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Gets the label of the header at given index.`fun header(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Gets current header labels.`fun header(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [hints](hints.md) | DSL builder helper for hints.`fun hints(init: Hints.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Hints`<br>`fun hints(providedSpec: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, init: Hints.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Hints` |
| [line](line.md) | Adds an unformatted row (aka line).`fun line(content: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Row` |
| [render](render.md) | Renders the content as a table.`fun render(out: `[`StringBuilder`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html)` = StringBuilder()): `[`StringBuilder`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html) |
| [row](row.md) | Sets the content values of a row.`fun row(vararg values: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): Row` |
