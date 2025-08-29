//[kformat](../../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)

# Hints

[JVM]\
class [Hints](index.md)(table: [Table](../index.md), var defaultAlignment: [Table.Hints.Alignment](-alignment/index.md) = Alignment.RIGHT, var borderStyle: [Table.BorderRenderer](../-border-renderer/index.md) = NONE, var ignoreAnsi: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = true)

Holds additional hints for rendering cells, such as cell content alignment.

## Constructors

| | |
|---|---|
| [Hints](-hints.md) | [JVM]<br>constructor(table: [Table](../index.md), defaultAlignment: [Table.Hints.Alignment](-alignment/index.md) = Alignment.RIGHT, borderStyle: [Table.BorderRenderer](../-border-renderer/index.md) = NONE, ignoreAnsi: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = true) |

## Types

| Name | Summary |
|---|---|
| [Alignment](-alignment/index.md) | [JVM]<br>enum [Alignment](-alignment/index.md) : [Enum](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-enum/index.html)&lt;[Table.Hints.Alignment](-alignment/index.md)&gt; <br>Defines the content alignment. |
| [Key](-key/index.md) | [JVM]<br>enum [Key](-key/index.md) : [Enum](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-enum/index.html)&lt;[Table.Hints.Key](-key/index.md)&gt; <br>Defines the (internal) hint keys. |

## Properties

| Name | Summary |
|---|---|
| [borderStyle](border-style.md) | [JVM]<br>var [borderStyle](border-style.md): [Table.BorderRenderer](../-border-renderer/index.md)<br>Defines the border style |
| [defaultAlignment](default-alignment.md) | [JVM]<br>var [defaultAlignment](default-alignment.md): [Table.Hints.Alignment](-alignment/index.md)<br>Defines the default horizontal cell alignment |
| [ignoreAnsi](ignore-ansi.md) | [JVM]<br>var [ignoreAnsi](ignore-ansi.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>Defines whether to ignore ANSI escape sequences for length calculation |

## Functions

| Name | Summary |
|---|---|
| [alignment](alignment.md) | [JVM]<br>fun [alignment](alignment.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)): [Table.Hints.Alignment](-alignment/index.md)<br>[JVM]<br>fun [alignment](alignment.md)(headerColumnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), alignment: [Table.Hints.Alignment](-alignment/index.md))<br>Defines the alignment of a column specified by the header column index.<br>[JVM]<br>fun [alignment](alignment.md)(headerLabel: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), alignment: [Table.Hints.Alignment](-alignment/index.md))<br>Defines the alignment of a column specified by the header label. |
| [formatFlag](format-flag.md) | [JVM]<br>fun [formatFlag](format-flag.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), flag: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>Provides a formatting flag instruction. |
| [leftMargin](left-margin.md) | [JVM]<br>fun [leftMargin](left-margin.md)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?<br>Gets the left margin value used for indenting rendered table.<br>[JVM]<br>fun [leftMargin](left-margin.md)(margin: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>Prepends the margin value for each output row. Can be used to indent a table. |
| [postfix](postfix.md) | [JVM]<br>fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)<br>Gets the postfix for given column, or an empty string if not set.<br>[JVM]<br>fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), postfix: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>Defines a postfix for a column specified by the column index.<br>[JVM]<br>fun [postfix](postfix.md)(headerLabel: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), postfix: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>Defines a postfix for a column specified by the header label. |
| [precision](precision.md) | [JVM]<br>fun [precision](precision.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>Defines the floating point precision of a column specified by the header column index.<br>[JVM]<br>fun [precision](precision.md)(headerLabel: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), value: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>Defines the floating point precision of a column specified by the header label. |
| [prefix](prefix.md) | [JVM]<br>fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)<br>Gets the prefix value for given column.<br>[JVM]<br>fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), prefix: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>Defines a prefix for a column specified by the column index.<br>[JVM]<br>fun [prefix](prefix.md)(headerLabel: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), prefix: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>Defines a prefix for a column specified by the header label. |