//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Row](index.md)



# Row  
 [JVM] Represents a table row of values.  
  
open inner class [Row](index.md)(**values**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [JVM] fun [<init>](-init-.md)(values: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [JVM]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [JVM]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [render](render.md)| [JVM]  <br>Brief description  <br>Renders the row values using provided value format specifiers  <br>Content  <br>open fun [render](render.md)(out: [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html), formatSpecs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, widths: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html))  <br><br><br>
| [toString](to-string.md)| [JVM]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [values](index.md#de.m3y.kformat/Table.Row/values/#/PointingToDeclaration/)|  [JVM] The values in this row. Can be used for dynamically appending additional values.val [values](index.md#de.m3y.kformat/Table.Row/values/#/PointingToDeclaration/): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>   <br>


## Inheritors  
  
|  Name| 
|---|
| [Table](../-line/index.md)

