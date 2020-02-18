[kformat](../../../index.md) / [de.m3y.kformat](../../index.md) / [Table](../index.md) / [Hints](./index.md)

# Hints

`class Hints`

Holds additional hints for rendering cells, such as cell content alignment.

### Types

| Name | Summary |
|---|---|
| [Alignment](-alignment/index.md) | Defines the content alignment.`enum class Alignment` |
| [Key](-key/index.md) | Defines the (internal) hint keys.`enum class Key` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Holds additional hints for rendering cells, such as cell content alignment.`Hints(table: `[`Table`](../index.md)`, defaultAlignment: Alignment = Alignment.RIGHT, borderStyle: BorderRenderer = NONE)` |

### Properties

| Name | Summary |
|---|---|
| [borderStyle](border-style.md) | `var borderStyle: BorderRenderer` |
| [defaultAlignment](default-alignment.md) | `var defaultAlignment: Alignment` |

### Functions

| Name | Summary |
|---|---|
| [alignment](alignment.md) | Defines the alignment of a column specified by the header label.`fun alignment(headerLabel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, alignment: Alignment): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Defines the alignment of a column specified by the header column index.`fun alignment(headerColumnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, alignment: Alignment): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [leftMargin](left-margin.md) | Prepends the margin value for each output row. Can be used to eg indent a table.`fun leftMargin(margin: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`fun leftMargin(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [postfix](postfix.md) | Defines a postfix for a column specified by the header label.`fun postfix(headerLabel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postfix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Defines a postfix for a column specified by the column index.`fun postfix(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, postfix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Gets the postfix for given column, or an empty string if not set.`fun postfix(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [precision](precision.md) | Defines the floating point precision of a column specified by the header label.`fun precision(headerLabel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Defines the floating point precision of a column specified by the header column index.`fun precision(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [prefix](prefix.md) | Defines a prefix for a column specified by the header label.`fun prefix(headerLabel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Defines a prefix for a column specified by the column index.`fun prefix(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`fun prefix(columnIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
