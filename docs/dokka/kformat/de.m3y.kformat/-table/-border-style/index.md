//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[BorderStyle](index.md)



# BorderStyle  
 [JVM] Renders borders with [NONE](-companion/index.md#de.m3y.kformat/Table.BorderStyle.Companion/NONE/#/PointingToDeclaration/) and [SINGLE_LINE](-companion/index.md#de.m3y.kformat/Table.BorderStyle.Companion/SINGLE_LINE/#/PointingToDeclaration/) implementations for a table.  
  
open class [BorderStyle](index.md)(**columnSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),**rowSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),**connectSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.BorderRenderer](../-border-renderer/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [JVM] fun [<init>](-init-.md)(columnSeparator: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), rowSeparator: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), connectSeparator: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [Companion](-companion/index.md)| [JVM]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [JVM]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hasColumnSeparator](has-column-separator.md)| [JVM]  <br>Content  <br>open override fun [hasColumnSeparator](has-column-separator.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [JVM]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [hasRowSeparator](has-row-separator.md)| [JVM]  <br>Content  <br>open override fun [hasRowSeparator](has-row-separator.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [renderConnect](render-connect.md)| [JVM]  <br>Content  <br>open override fun [renderConnect](render-connect.md)(out: [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html))  <br><br><br>
| [renderHorizontal](render-horizontal.md)| [JVM]  <br>Content  <br>open override fun [renderHorizontal](render-horizontal.md)(out: [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html))  <br><br><br>
| [renderVertical](render-vertical.md)| [JVM]  <br>Content  <br>open override fun [renderVertical](render-vertical.md)(out: [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html))  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [JVM]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

