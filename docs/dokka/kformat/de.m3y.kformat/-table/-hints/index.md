//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)



# Hints  
 [JVM] Holds additional hints for rendering cells, such as cell content alignment.  
  
class [Hints](index.md)(**table**: [Table](../index.md),**defaultAlignment**: [Table.Hints.Alignment](-alignment/index.md),**borderStyle**: [Table.BorderRenderer](../-border-renderer/index.md))   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [JVM] fun [<init>](-init-.md)(table: [Table](../index.md), defaultAlignment: [Table.Hints.Alignment](-alignment/index.md), borderStyle: [Table.BorderRenderer](../-border-renderer/index.md))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [Alignment](-alignment/index.md)| [JVM]  <br>Brief description  <br>Defines the content alignment.  <br>Content  <br>enum [Alignment](-alignment/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)  <br><br><br>
| [Key](-key/index.md)| [JVM]  <br>Brief description  <br>Defines the (internal) hint keys.KeyFormat ::= ColumnFormat ':' KeyName ColumnFormat ::= Integer | '*' KeyName ::= 'alignment'| ....  <br>Content  <br>enum [Key](-key/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [alignment](alignment.md)| [JVM]  <br>Brief description  <br>Defines the alignment of a column specified by the header label.  <br>Content  <br>fun [alignment](alignment.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), alignment: [Table.Hints.Alignment](-alignment/index.md))  <br><br><br>[JVM]  <br>Brief description  <br>Defines the alignment of a column specified by the header column index.  <br>Content  <br>fun [alignment](alignment.md)(headerColumnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), alignment: [Table.Hints.Alignment](-alignment/index.md))  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [JVM]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [formatFlag](format-flag.md)| [JVM]  <br>Brief description  <br>Provides a formatting flag instruction.  <br>Content  <br>fun [formatFlag](format-flag.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), flag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [JVM]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [leftMargin](left-margin.md)| [JVM]  <br>Brief description  <br>Prepends the margin value for each output row. Can be used to eg indent a table.  <br>Content  <br>fun [leftMargin](left-margin.md)(margin: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>[JVM]  <br>Brief description  <br>Gets the left margin value used for indenting rendered table.  <br>Content  <br>fun [leftMargin](left-margin.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| [postfix](postfix.md)| [JVM]  <br>Brief description  <br>Defines a postfix for a column specified by the header label.  <br>Content  <br>fun [postfix](postfix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), postfix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>[JVM]  <br>Brief description  <br>Defines a postfix for a column specified by the column index.  <br>Content  <br>fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), postfix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>[JVM]  <br>Brief description  <br>Gets the postfix for given column, or an empty string if not set.  <br>Content  <br>fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [precision](precision.md)| [JVM]  <br>Brief description  <br>Defines the floating point precision of a column specified by the header label.  <br>Content  <br>fun [precision](precision.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>[JVM]  <br>Brief description  <br>Defines the floating point precision of a column specified by the header column index.  <br>Content  <br>fun [precision](precision.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>
| [prefix](prefix.md)| [JVM]  <br>Brief description  <br>Defines a prefix for a column specified by the header label.  <br>Content  <br>fun [prefix](prefix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>[JVM]  <br>Brief description  <br>Defines a prefix for a column specified by the column index.  <br>Content  <br>fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>[JVM]  <br>Brief description  <br>Gets the prefix value for given column.  <br>Content  <br>fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [JVM]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [borderStyle](index.md#de.m3y.kformat/Table.Hints/borderStyle/#/PointingToDeclaration/)|  [JVM] Defines the border stylevar [borderStyle](index.md#de.m3y.kformat/Table.Hints/borderStyle/#/PointingToDeclaration/): [Table.BorderRenderer](../-border-renderer/index.md)   <br>
| [defaultAlignment](index.md#de.m3y.kformat/Table.Hints/defaultAlignment/#/PointingToDeclaration/)|  [JVM] Defines the default horizontal cell alignmentvar [defaultAlignment](index.md#de.m3y.kformat/Table.Hints/defaultAlignment/#/PointingToDeclaration/): [Table.Hints.Alignment](-alignment/index.md)   <br>

