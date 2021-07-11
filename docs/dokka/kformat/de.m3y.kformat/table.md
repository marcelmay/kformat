//[kformat](../../index.md)/[de.m3y.kformat](index.md)/[table](table.md)

# table

[JVM]\
fun [table](table.md)(init: [Table](-table/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table](-table/index.md)

Starts building a table.

Usage:

```
table {
    header("A", "B", "C")
    row(10, "some text value", 2.1f)
    ...
}.render(StringBuilder())
```
