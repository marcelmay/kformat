//[kformat](../../index.md)/[de.m3y.kformat](index.md)/[table](table.md)

# table

[JVM]\
fun [table](table.md)(init: [Table](-table/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table](-table/index.md)

Starts building a table.

Usage:

table {\
    header(&quot;A&quot;, &quot;B&quot;, &quot;C&quot;)\
    row(10, &quot;some text value&quot;, 2.1f)\
    ...\
}.render(StringBuilder())
