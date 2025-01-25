//[kformat](../../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[BorderStyle](index.md)

# BorderStyle

[JVM]\
open class [BorderStyle](index.md)(columnSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), rowSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), connectSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) = columnSeparator) : [Table.BorderRenderer](../-border-renderer/index.md)

Renders borders with [NONE](-companion/-n-o-n-e.md) and [SINGLE_LINE](-companion/-s-i-n-g-l-e_-l-i-n-e.md) implementations for a table.

## Constructors

| | |
|---|---|
| [BorderStyle](-border-style.md) | [JVM]<br>constructor(columnSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), rowSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), connectSeparator: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) = columnSeparator) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [JVM]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [hasColumnSeparator](has-column-separator.md) | [JVM]<br>open override fun [hasColumnSeparator](has-column-separator.md)(): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [hasRowSeparator](has-row-separator.md) | [JVM]<br>open override fun [hasRowSeparator](has-row-separator.md)(): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [renderConnect](render-connect.md) | [JVM]<br>open override fun [renderConnect](render-connect.md)(out: [StringBuilder](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/index.html)) |
| [renderHorizontal](render-horizontal.md) | [JVM]<br>open override fun [renderHorizontal](render-horizontal.md)(out: [StringBuilder](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/index.html)) |
| [renderVertical](render-vertical.md) | [JVM]<br>open override fun [renderVertical](render-vertical.md)(out: [StringBuilder](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/index.html)) |