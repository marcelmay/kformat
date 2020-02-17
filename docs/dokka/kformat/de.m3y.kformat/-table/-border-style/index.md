[kformat](../../../index.md) / [de.m3y.kformat](../../index.md) / [Table](../index.md) / [BorderStyle](./index.md)

# BorderStyle

`class BorderStyle : BorderRenderer`

Renders borders with [NONE](-n-o-n-e.md) and [SINGLE_LINE](-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Renders borders with [NONE](-n-o-n-e.md) and [SINGLE_LINE](-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table.`BorderStyle(columnSeparator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, rowSeparator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, connectSeparator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = columnSeparator)` |

### Functions

| Name | Summary |
|---|---|
| [hasColumnSeparator](has-column-separator.md) | `open fun hasColumnSeparator(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasRowSeparator](has-row-separator.md) | `open fun hasRowSeparator(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [renderConnect](render-connect.md) | `open fun renderConnect(out: `[`StringBuilder`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [renderHorizontal](render-horizontal.md) | `open fun renderHorizontal(out: `[`StringBuilder`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [renderVertical](render-vertical.md) | `open fun renderVertical(out: `[`StringBuilder`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [NONE](-n-o-n-e.md) | Renders no border.`val NONE: BorderStyle` |
| [SINGLE_LINE](-s-i-n-g-l-e_-l-i-n-e.md) | Renders a single line border.`val SINGLE_LINE: BorderStyle` |
