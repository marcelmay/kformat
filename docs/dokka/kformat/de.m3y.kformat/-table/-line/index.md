//[kformat](../../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Line](index.md)

# Line

[JVM]\
inner class [Line](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Table.Row](../-row/index.md)

A line is a special row containing a single value which spans all columns and renders without formatting.

## Constructors

| | |
|---|---|
| [Line](-line.md) | [JVM]<br>fun [Line](-line.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [render](render.md) | [JVM]<br>open override fun [render](render.md)(out: [StringBuilder](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/index.html), formatSpecs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, widths: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html))<br>Renders the row values using provided value format specifiers |
| [toString](../-row/to-string.md) | [JVM]<br>open override fun [toString](../-row/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [values](index.md#1784250165%2FProperties%2F-1067530276) | [JVM]<br>val [values](index.md#1784250165%2FProperties%2F-1067530276): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)><br>The values in this row. |
