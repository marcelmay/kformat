//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[BorderStyle](index.md)



# BorderStyle  
 [JVM] open class [BorderStyle](index.md)(**columnSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **rowSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **connectSeparator**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.BorderRenderer](../-border-renderer/index.md)

Renders borders with [NONE](-companion/-n-o-n-e.md) and [SINGLE_LINE](-companion/-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.BorderStyle/BorderStyle/#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[BorderStyle](-border-style.md)| <a name="de.m3y.kformat/Table.BorderStyle/BorderStyle/#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a> [JVM] fun [BorderStyle](-border-style.md)(columnSeparator: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), rowSeparator: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), connectSeparator: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = columnSeparator)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.BorderStyle.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="de.m3y.kformat/Table.BorderStyle.Companion///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-hints/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1268829873)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open operator fun [equals](../-hints/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1268829873)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table.BorderStyle/hasColumnSeparator/#/PointingToDeclaration/"></a>[hasColumnSeparator](has-column-separator.md)| <a name="de.m3y.kformat/Table.BorderStyle/hasColumnSeparator/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [hasColumnSeparator](has-column-separator.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-hints/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1268829873)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [hashCode](../-hints/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1268829873)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table.BorderStyle/hasRowSeparator/#/PointingToDeclaration/"></a>[hasRowSeparator](has-row-separator.md)| <a name="de.m3y.kformat/Table.BorderStyle/hasRowSeparator/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [hasRowSeparator](has-row-separator.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table.BorderStyle/renderConnect/#java.lang.StringBuilder/PointingToDeclaration/"></a>[renderConnect](render-connect.md)| <a name="de.m3y.kformat/Table.BorderStyle/renderConnect/#java.lang.StringBuilder/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [renderConnect](render-connect.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html))  <br><br><br>
| <a name="de.m3y.kformat/Table.BorderStyle/renderHorizontal/#java.lang.StringBuilder/PointingToDeclaration/"></a>[renderHorizontal](render-horizontal.md)| <a name="de.m3y.kformat/Table.BorderStyle/renderHorizontal/#java.lang.StringBuilder/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [renderHorizontal](render-horizontal.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html))  <br><br><br>
| <a name="de.m3y.kformat/Table.BorderStyle/renderVertical/#java.lang.StringBuilder/PointingToDeclaration/"></a>[renderVertical](render-vertical.md)| <a name="de.m3y.kformat/Table.BorderStyle/renderVertical/#java.lang.StringBuilder/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open override fun [renderVertical](render-vertical.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html))  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-hints/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1268829873)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [toString](../-hints/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1268829873)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

