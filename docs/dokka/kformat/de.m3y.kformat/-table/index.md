//[kformat](../../../index.md)/[de.m3y.kformat](../index.md)/[Table](index.md)

# Table

[JVM]\
class [Table](index.md)

Provides a DSL for simple table formatted text output.

- 
   A table consists of one (optional) header and a list of rows
- 
   Rendering formats row values, using optional hints for precision or alignment
- 
   Rendering auto-sizes cell widths

Example:

```kotlin
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

```kotlin
A      B     C Long_Header
10 b...1 2.10%         foo
20    b2 0.33%         bar
```

## Types

| Name | Summary |
|---|---|
| [BorderRenderer](-border-renderer/index.md) | [JVM]<br>interface [BorderRenderer](-border-renderer/index.md)<br>Renders a border. |
| [BorderStyle](-border-style/index.md) | [JVM]<br>open class [BorderStyle](-border-style/index.md)(columnSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), rowSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), connectSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) = columnSeparator) : [Table.BorderRenderer](-border-renderer/index.md)<br>Renders borders with [NONE](-border-style/-companion/-n-o-n-e.md) and [SINGLE_LINE](-border-style/-companion/-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table. |
| [Hints](-hints/index.md) | [JVM]<br>class [Hints](-hints/index.md)(table: [Table](index.md), var defaultAlignment: [Table.Hints.Alignment](-hints/-alignment/index.md) = Alignment.RIGHT, var borderStyle: [Table.BorderRenderer](-border-renderer/index.md) = NONE)<br>Holds additional hints for rendering cells, such as cell content alignment. |
| [Line](-line/index.md) | [JVM]<br>inner class [Line](-line/index.md)(value: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)) : [Table.Row](-row/index.md)<br>A line is a special row containing a single value which spans all columns and renders without formatting. |
| [Row](-row/index.md) | [JVM]<br>open inner class [Row](-row/index.md)(val values: [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)&gt;)<br>Represents a table row of values. |

## Functions

| Name | Summary |
|---|---|
| [hasRows](has-rows.md) | [JVM]<br>fun [hasRows](has-rows.md)(): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>Returns true if table contains at least one 'data' row. |
| [header](header.md) | [JVM]<br>fun [header](header.md)(vararg labels: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [Table.Row](-row/index.md)<br>fun [header](header.md)(labels: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;): [Table.Row](-row/index.md)<br>Sets the header labels. |
| [hints](hints.md) | [JVM]<br>fun [hints](hints.md)(init: [Table.Hints](-hints/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [Table.Hints](-hints/index.md)<br>fun [hints](hints.md)(providedSpec: [Map](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)&gt;, init: [Table.Hints](-hints/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [Table.Hints](-hints/index.md)<br>DSL builder helper for hints. |
| [line](line.md) | [JVM]<br>fun [line](line.md)(content: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) = &quot;&quot;): [Table.Row](-row/index.md)<br>Adds an unformatted row (aka line). |
| [print](print.md) | [JVM]<br>fun [print](print.md)(printStream: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html) = System.out)<br>Prints this table to a stream |
| [render](render.md) | [JVM]<br>fun [render](render.md)(out: [StringBuilder](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/index.html) = StringBuilder()): [StringBuilder](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/index.html)<br>Renders the content as a table. |
| [row](row.md) | [JVM]<br>fun [row](row.md)(vararg values: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)): [Table.Row](-row/index.md)<br>Sets the content values of a row. |
| [rows](rows.md) | [JVM]<br>fun [rows](rows.md)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Table.Row](-row/index.md)&gt;<br>Gets the current rows. |
| [separator](separator.md) | [JVM]<br>fun [separator](separator.md)(): [Table.Row](-row/index.md)<br>Adds a separator row. |
| [toString](to-string.md) | [JVM]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)<br>Renders this table to a formatted string. |