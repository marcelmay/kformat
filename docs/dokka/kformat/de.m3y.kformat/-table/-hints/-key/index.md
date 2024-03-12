//[kformat](../../../../../index.md)/[de.m3y.kformat](../../../index.md)/[Table](../../index.md)/[Hints](../index.md)/[Key](index.md)

# Key

[JVM]\
enum [Key](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Table.Hints.Key](index.md)&gt; 

Defines the (internal) hint keys.

KeyFormat ::= ColumnFormat ':' KeyName ColumnFormat ::= Integer | '*' KeyName ::= 'alignment'| ...

## Entries

| | |
|---|---|
| [Alignment](-alignment/index.md) | [JVM]<br>[Alignment](-alignment/index.md) |
| [FormatFlag](-format-flag/index.md) | [JVM]<br>[FormatFlag](-format-flag/index.md) |
| [Header](-header/index.md) | [JVM]<br>[Header](-header/index.md) |
| [LeftMargin](-left-margin/index.md) | [JVM]<br>[LeftMargin](-left-margin/index.md) |
| [Line](-line/index.md) | [JVM]<br>[Line](-line/index.md) |
| [Postfix](-postfix/index.md) | [JVM]<br>[Postfix](-postfix/index.md) |
| [Precision](-precision/index.md) | [JVM]<br>[Precision](-precision/index.md) |
| [Prefix](-prefix/index.md) | [JVM]<br>[Prefix](-prefix/index.md) |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [JVM]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[Table.Hints.Key](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [name](-prefix/index.md#-372974862%2FProperties%2F-1067530276) | [JVM]<br>val [name](-prefix/index.md#-372974862%2FProperties%2F-1067530276): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](-prefix/index.md#-739389684%2FProperties%2F-1067530276) | [JVM]<br>val [ordinal](-prefix/index.md#-739389684%2FProperties%2F-1067530276): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [ofAnyColumn](of-any-column.md) | [JVM]<br>fun [ofAnyColumn](of-any-column.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ofColumn](of-column.md) | [JVM]<br>fun [ofColumn](of-column.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [valueOf](value-of.md) | [JVM]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Table.Hints.Key](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [JVM]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Table.Hints.Key](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
