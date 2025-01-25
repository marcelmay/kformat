//[kformat](../../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)/[postfix](postfix.md)

# postfix

[JVM]\
fun [postfix](postfix.md)(headerLabel: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), postfix: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))

Defines a postfix for a column specified by the header label.

[JVM]\
fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), postfix: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))

Defines a postfix for a column specified by the column index.

#### Parameters

JVM

| | |
|---|---|
| columnIndex | the columnIndex, starting at 0 |
| postfix | the value to be post-fixed to each row value and given column index. |

[JVM]\
fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)

Gets the postfix for given column, or an empty string if not set.

#### Return

the postfix value or empty string (if not set)

#### Parameters

JVM

| | |
|---|---|
| columnIndex | the columnIndex, starting at 0 |