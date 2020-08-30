//[kformat](../../index.md)/[de.m3y.kformat](../index.md)/[Table](index.md)



# Table  
 [JVM] Provides a DSL for simple table formatted text output.<ul><li>A table consists of one (optional) header and a list of rows</li><li>Rendering formats row values, using optional hints for precision or alignment</li><li>Rendering auto-sizes cell widths</li></ul>Example:table {  
    header("A", "B", "C", "Long_Header")  
  
    row(10, "b...1", 2.1f, "foo")  
    row(20, "b2", 1 / 3f, "bar")  
  
    hints {  
        alignment("A", Hints.Alignment.LEFT)  
        precision("C", 2)  
        postfix("C", "%")  
    }  
}.render(StringBuilder())producesA      B     C Long_Header  
10 b...1 2.10%         foo  
20    b2 0.33%         bar  
  
class [Table](index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| [BorderRenderer](-border-renderer/index.md)| [JVM]  <br>Brief description  <br>Renders a border.  <br>Content  <br>interface [BorderRenderer](-border-renderer/index.md)  <br><br><br>
| [BorderStyle](-border-style/index.md)| [JVM]  <br>Brief description  <br>Renders borders with [NONE](-border-style/-companion/index.md#de.m3y.kformat/Table.BorderStyle.Companion/NONE/#/PointingToDeclaration/) and [SINGLE_LINE](-border-style/-companion/index.md#de.m3y.kformat/Table.BorderStyle.Companion/SINGLE_LINE/#/PointingToDeclaration/) implementations for a table.  <br>Content  <br>open class [BorderStyle](-border-style/index.md)(**columnSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),**rowSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),**connectSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.BorderRenderer](-border-renderer/index.md)  <br><br><br>
| [Hints](-hints/index.md)| [JVM]  <br>Brief description  <br>Holds additional hints for rendering cells, such as cell content alignment.  <br>Content  <br>class [Hints](-hints/index.md)(**table**: [Table](index.md),**defaultAlignment**: [Table.Hints.Alignment](-hints/-alignment/index.md),**borderStyle**: [Table.BorderRenderer](-border-renderer/index.md))  <br><br><br>
| [Line](-line/index.md)| [JVM]  <br>Brief description  <br>A line is a special row containing a single value which spans all columns and renders without formatting.  <br>Content  <br>inner class [Line](-line/index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.Row](-row/index.md)  <br><br><br>
| [Row](-row/index.md)| [JVM]  <br>Brief description  <br>Represents a table row of values.  <br>Content  <br>open inner class [Row](-row/index.md)(**values**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [JVM]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [JVM]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [hasRows](has-rows.md)| [JVM]  <br>Brief description  <br>Returns true if table contains at least one 'data' row.Note: A 'line(...)' does not count as a row.  <br>Content  <br>fun [hasRows](has-rows.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [header](header.md)| [JVM]  <br>Brief description  <br>Sets the header labels.Note: Replaces any previous values.  <br>Content  <br>fun [header](header.md)(vararg labels: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<Out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>fun [header](header.md)(labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br><br><br>[JVM]  <br>Brief description  <br>Gets the label of the header at given index.  <br>Content  <br>fun [header](header.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>[JVM]  <br>Brief description  <br>Gets current header labels.  <br>Content  <br>fun [header](header.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>
| [hints](hints.md)| [JVM]  <br>Brief description  <br>DSL builder helper for hints.  <br>Content  <br>fun [hints](hints.md)(init: [Table.Hints](-hints/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table.Hints](-hints/index.md)  <br>fun [hints](hints.md)(providedSpec: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, init: [Table.Hints](-hints/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table.Hints](-hints/index.md)  <br><br><br>
| [line](line.md)| [JVM]  <br>Brief description  <br>Adds an unformatted row (aka line).  <br>Content  <br>fun [line](line.md)(content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Table.Row](-row/index.md)  <br><br><br>
| [render](render.md)| [JVM]  <br>Brief description  <br>Renders the content as a table.  <br>Content  <br>fun [render](render.md)(out: [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)): [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)  <br><br><br>
| [row](row.md)| [JVM]  <br>Brief description  <br>Sets the content values of a row.  <br>Content  <br>fun [row](row.md)(vararg values: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Table.Row](-row/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [JVM]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

