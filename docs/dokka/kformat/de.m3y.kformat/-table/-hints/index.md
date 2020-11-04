//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)



# Hints  
 [JVM] class [Hints](index.md)(**table**: [Table](../index.md), **defaultAlignment**: [Table.Hints.Alignment](-alignment/index.md), **borderStyle**: [Table.BorderRenderer](../-border-renderer/index.md))

Holds additional hints for rendering cells, such as cell content alignment.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/Hints/#de.m3y.kformat.Table#de.m3y.kformat.Table.Hints.Alignment#de.m3y.kformat.Table.BorderRenderer/PointingToDeclaration/"></a>[Hints](-hints.md)| <a name="de.m3y.kformat/Table.Hints/Hints/#de.m3y.kformat.Table#de.m3y.kformat.Table.Hints.Alignment#de.m3y.kformat.Table.BorderRenderer/PointingToDeclaration/"></a> [JVM] fun [Hints](-hints.md)(table: [Table](../index.md), defaultAlignment: [Table.Hints.Alignment](-alignment/index.md) = Alignment.RIGHT, borderStyle: [Table.BorderRenderer](../-border-renderer/index.md) = NONE)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints.Alignment///PointingToDeclaration/"></a>[Alignment](-alignment/index.md)| <a name="de.m3y.kformat/Table.Hints.Alignment///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>enum [Alignment](-alignment/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Table.Hints.Alignment](-alignment/index.md)>   <br>More info  <br>Defines the content alignment.  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints.Key///PointingToDeclaration/"></a>[Key](-key/index.md)| <a name="de.m3y.kformat/Table.Hints.Key///PointingToDeclaration/"></a>[JVM]  <br>Content  <br>enum [Key](-key/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Table.Hints.Key](-key/index.md)>   <br>More info  <br>Defines the (internal) hint keys.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/alignment/#kotlin.Int#de.m3y.kformat.Table.Hints.Alignment/PointingToDeclaration/"></a>[alignment](alignment.md)| <a name="de.m3y.kformat/Table.Hints/alignment/#kotlin.Int#de.m3y.kformat.Table.Hints.Alignment/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [alignment](alignment.md)(headerColumnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), alignment: [Table.Hints.Alignment](-alignment/index.md))  <br>More info  <br>Defines the alignment of a column specified by the header column index.  <br><br><br>[JVM]  <br>Content  <br>fun [alignment](alignment.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), alignment: [Table.Hints.Alignment](-alignment/index.md))  <br>More info  <br>Defines the alignment of a column specified by the header label.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open operator fun [equals](index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints/formatFlag/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>[formatFlag](format-flag.md)| <a name="de.m3y.kformat/Table.Hints/formatFlag/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [formatFlag](format-flag.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), flag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Provides a formatting flag instruction.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [hashCode](index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints/leftMargin/#/PointingToDeclaration/"></a>[leftMargin](left-margin.md)| <a name="de.m3y.kformat/Table.Hints/leftMargin/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [leftMargin](left-margin.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br>More info  <br>Gets the left margin value used for indenting rendered table.  <br><br><br>[JVM]  <br>Content  <br>fun [leftMargin](left-margin.md)(margin: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Prepends the margin value for each output row.  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int/PointingToDeclaration/"></a>[postfix](postfix.md)| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Gets the postfix for given column, or an empty string if not set.  <br><br><br>[JVM]  <br>Content  <br>fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), postfix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Defines a postfix for a column specified by the column index.  <br><br><br>[JVM]  <br>Content  <br>fun [postfix](postfix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), postfix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Defines a postfix for a column specified by the header label.  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints/precision/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[precision](precision.md)| <a name="de.m3y.kformat/Table.Hints/precision/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [precision](precision.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Defines the floating point precision of a column specified by the header column index.  <br><br><br>[JVM]  <br>Content  <br>fun [precision](precision.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Defines the floating point precision of a column specified by the header label.  <br><br><br>
| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.Int/PointingToDeclaration/"></a>[prefix](prefix.md)| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.Int/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Gets the prefix value for given column.  <br><br><br>[JVM]  <br>Content  <br>fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Defines a prefix for a column specified by the column index.  <br><br><br>[JVM]  <br>Content  <br>fun [prefix](prefix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Defines a prefix for a column specified by the header label.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[JVM]  <br>Content  <br>open fun [toString](index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-754127688)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/borderStyle/#/PointingToDeclaration/"></a>[borderStyle](border-style.md)| <a name="de.m3y.kformat/Table.Hints/borderStyle/#/PointingToDeclaration/"></a> [JVM] var [borderStyle](border-style.md): [Table.BorderRenderer](../-border-renderer/index.md)Defines the border style   <br>
| <a name="de.m3y.kformat/Table.Hints/defaultAlignment/#/PointingToDeclaration/"></a>[defaultAlignment](default-alignment.md)| <a name="de.m3y.kformat/Table.Hints/defaultAlignment/#/PointingToDeclaration/"></a> [JVM] var [defaultAlignment](default-alignment.md): [Table.Hints.Alignment](-alignment/index.md)Defines the default horizontal cell alignment   <br>

