//[kformat](../../index.md)/[de.m3y.kformat](../index.md)/[Table](index.md)



# Table  
 [JVM] class [Table](index.md)

Provides a DSL for simple table formatted text output.

<ul><li>A table consists of one (optional) header and a list of rows</li><li>Rendering formats row values, using optional hints for precision or alignment</li><li>Rendering auto-sizes cell widths</li></ul>

Example:

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

produces

A      B     C Long_Header  
10 b...1 2.10%         foo  
20    b2 0.33%         bar   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.BorderRenderer///PointingToDeclaration/"></a>[BorderRenderer](-border-renderer/index.md)| <a name="de.m3y.kformat/Table.BorderRenderer///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>interface [BorderRenderer](-border-renderer/index.md)  <br>More info  <br>Renders a border.  <br><br><br>
| <a name="de.m3y.kformat/Table.BorderStyle///PointingToDeclaration/"></a>[BorderStyle](-border-style/index.md)| <a name="de.m3y.kformat/Table.BorderStyle///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open class [BorderStyle](-border-style/index.md)(**columnSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **rowSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **connectSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.BorderRenderer](-border-renderer/index.md)  <br>More info  <br>Renders borders with [NONE](-border-style/-companion/-n-o-n-e.md) and [SINGLE_LINE](-border-style/-companion/-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table.  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints///PointingToDeclaration/"></a>[Hints](-hints/index.md)| <a name="de.m3y.kformat/Table.Hints///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>class [Hints](-hints/index.md)(**table**: [Table](index.md), **defaultAlignment**: [Table.Hints.Alignment](-hints/-alignment/index.md), **borderStyle**: [Table.BorderRenderer](-border-renderer/index.md))  <br>More info  <br>Holds additional hints for rendering cells, such as cell content alignment.  <br><br><br>
| <a name="de.m3y.kformat/Table.Line///PointingToDeclaration/"></a>[Line](-line/index.md)| <a name="de.m3y.kformat/Table.Line///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>inner class [Line](-line/index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.Row](-row/index.md)  <br>More info  <br>A line is a special row containing a single value which spans all columns and renders without formatting.  <br><br><br>
| <a name="de.m3y.kformat/Table.Row///PointingToDeclaration/"></a>[Row](-row/index.md)| <a name="de.m3y.kformat/Table.Row///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open inner class [Row](-row/index.md)(**values**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br>More info  <br>Represents a table row of values.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](-hints/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-627416167)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open operator fun [equals](-hints/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-627416167)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](-hints/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-627416167)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [hashCode](-hints/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-627416167)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table/hasRows/#/PointingToDeclaration/"></a>[hasRows](has-rows.md)| <a name="de.m3y.kformat/Table/hasRows/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [hasRows](has-rows.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if table contains at least one 'data' row.  <br><br><br>
| <a name="de.m3y.kformat/Table/header/#kotlin.Array[kotlin.String]/PointingToDeclaration/"></a>[header](header.md)| <a name="de.m3y.kformat/Table/header/#kotlin.Array[kotlin.String]/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [header](header.md)(vararg labels: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Table.Row](-row/index.md)  <br>fun [header](header.md)(labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>): [Table.Row](-row/index.md)  <br>More info  <br>Sets the header labels.  <br><br><br>
| <a name="de.m3y.kformat/Table/hints/#kotlin.Function1[de.m3y.kformat.Table.Hints,kotlin.Unit]/PointingToDeclaration/"></a>[hints](hints.md)| <a name="de.m3y.kformat/Table/hints/#kotlin.Function1[de.m3y.kformat.Table.Hints,kotlin.Unit]/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [hints](hints.md)(init: [Table.Hints](-hints/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table.Hints](-hints/index.md)  <br>fun [hints](hints.md)(providedSpec: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, init: [Table.Hints](-hints/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table.Hints](-hints/index.md)  <br>More info  <br>DSL builder helper for hints.  <br><br><br>
| <a name="de.m3y.kformat/Table/line/#kotlin.String/PointingToDeclaration/"></a>[line](line.md)| <a name="de.m3y.kformat/Table/line/#kotlin.String/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [line](line.md)(content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ""): [Table.Row](-row/index.md)  <br>More info  <br>Adds an unformatted row (aka line).  <br><br><br>
| <a name="de.m3y.kformat/Table/render/#java.lang.StringBuilder/PointingToDeclaration/"></a>[render](render.md)| <a name="de.m3y.kformat/Table/render/#java.lang.StringBuilder/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [render](render.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html) = StringBuilder()): [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html)  <br>More info  <br>Renders the content as a table.  <br><br><br>
| <a name="de.m3y.kformat/Table/row/#kotlin.Array[kotlin.Any]/PointingToDeclaration/"></a>[row](row.md)| <a name="de.m3y.kformat/Table/row/#kotlin.Array[kotlin.Any]/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [row](row.md)(vararg values: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [Table.Row](-row/index.md)  <br>More info  <br>Sets the content values of a row.  <br><br><br>
| <a name="de.m3y.kformat/Table/rows/#/PointingToDeclaration/"></a>[rows](rows.md)| <a name="de.m3y.kformat/Table/rows/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [rows](rows.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Table.Row](-row/index.md)>  <br>More info  <br>Gets the current rows.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](-hints/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-627416167)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [toString](-hints/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-627416167)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

