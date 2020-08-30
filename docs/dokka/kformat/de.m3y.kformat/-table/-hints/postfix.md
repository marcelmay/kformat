[kformat](../../../index.md) / [de.m3y.kformat](../../index.md) / [Table](../index.md) / [Hints](index.md) / [postfix](./postfix.md)

# postfix

`fun postfix(headerLabel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postfix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Defines a postfix for a column specified by the header label.

`fun postfix(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, postfix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Defines a postfix for a column specified by the column index.

### Parameters

`columnIndex` - the columnIndex, starting at 0

`postfix` - the value to be post-fixed to each row value and given column index.`fun postfix(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Gets the postfix for given column, or an empty string if not set.

### Parameters

`columnIndex` - the columnIndex, starting at 0

**Return**
the postfix value or empty string (if not set)

