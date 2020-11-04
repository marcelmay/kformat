//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Line](index.md)



# Line  
 [JVM] inner class [Line](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.Row](../-row/index.md)

A line is a special row containing a single value which spans all columns and renders without formatting.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Line/Line/#kotlin.String/PointingToDeclaration/"></a>[Line](-line.md)| <a name="de.m3y.kformat/Table.Line/Line/#kotlin.String/PointingToDeclaration/"></a> [JVM] fun [Line](-line.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-hints/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open operator fun [equals](../-hints/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-hints/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [hashCode](../-hints/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table.Line/render/#java.lang.StringBuilder#kotlin.collections.List[kotlin.String]#kotlin.IntArray/PointingToDeclaration/"></a>[render](render.md)| <a name="de.m3y.kformat/Table.Line/render/#java.lang.StringBuilder#kotlin.collections.List[kotlin.String]#kotlin.IntArray/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [render](render.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html), formatSpecs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, widths: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html))  <br>More info  <br>Renders the row values using provided value format specifiers  <br><br><br>
| <a name="de.m3y.kformat/Table.Row/toString/#/PointingToDeclaration/"></a>[toString](../-row/to-string.md)| <a name="de.m3y.kformat/Table.Row/toString/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [toString](../-row/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Line/values/#/PointingToDeclaration/"></a>[values](values.md)| <a name="de.m3y.kformat/Table.Line/values/#/PointingToDeclaration/"></a> [JVM] val [values](values.md): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>The values in this row.   <br>

