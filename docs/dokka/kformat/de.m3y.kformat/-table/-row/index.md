[kformat](../../../index.md) / [de.m3y.kformat](../../index.md) / [Table](../index.md) / [Row](./index.md)

# Row

`inner class Row`

Represents a table row of values.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents a table row of values.`Row(values: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [values](values.md) | The values in this row. Can be used for dynamically appending additional values.`val values: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` |

### Functions

| Name | Summary |
|---|---|
| [render](render.md) | Renders the row values using provided value format specifiers`open fun render(out: `[`StringBuilder`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html)`, formatSpecs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toString](to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
