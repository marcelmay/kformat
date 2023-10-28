//[kformat](../../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Row](index.md)

# Row

open inner class [Row](index.md)(val values: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;)

Represents a table row of values.

#### Inheritors

| |
|---|
| [Line](../-line/index.md) |

## Constructors

| | |
|---|---|
| [Row](-row.md) | [JVM]<br>constructor(values: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [values](values.md) | [JVM]<br>val [values](values.md): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>The values in this row. Can be used for dynamically appending additional values. |

## Functions

| Name | Summary |
|---|---|
| [render](render.md) | [JVM]<br>open fun [render](render.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html), formatSpecs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, widths: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html))<br>Renders the row values using provided value format specifiers |
| [toString](to-string.md) | [JVM]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
