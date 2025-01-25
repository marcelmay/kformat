//[kformat](../../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Line](index.md)

# Line

[JVM]\
inner class [Line](index.md)(value: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)) : [Table.Row](../-row/index.md)

A line is a special row containing a single value which spans all columns and renders without formatting.

## Constructors

| | |
|---|---|
| [Line](-line.md) | [JVM]<br>constructor(value: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [values](../-row/values.md) | [JVM]<br>val [values](../-row/values.md): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)&gt;<br>The values in this row. Can be used for dynamically appending additional values. |

## Functions

| Name | Summary |
|---|---|
| [render](render.md) | [JVM]<br>open override fun [render](render.md)(out: [StringBuilder](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/index.html), formatSpecs: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;, widths: [IntArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int-array/index.html))<br>Renders the row values using provided value format specifiers |
| [toString](../-row/to-string.md) | [JVM]<br>open override fun [toString](../-row/to-string.md)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |