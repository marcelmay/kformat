//[kformat](../index.md)/[de.m3y.kformat](index.md)



# Package de.m3y.kformat  


## Types  
  
|  Name|  Summary| 
|---|---|
| [Table](-table/index.md)| [JVM]  <br>Brief description  <br>Provides a DSL for simple table formatted text output.<ul><li>A table consists of one (optional) header and a list of rows</li><li>Rendering formats row values, using optional hints for precision or alignment</li><li>Rendering auto-sizes cell widths</li></ul>Example:table {  <br>    header("A", "B", "C", "Long_Header")  <br>  <br>    row(10, "b...1", 2.1f, "foo")  <br>    row(20, "b2", 1 / 3f, "bar")  <br>  <br>    hints {  <br>        alignment("A", Hints.Alignment.LEFT)  <br>        precision("C", 2)  <br>        postfix("C", "%")  <br>    }  <br>}.render(StringBuilder())producesA      B     C Long_Header  <br>10 b...1 2.10%         foo  <br>20    b2 0.33%         bar  <br>Content  <br>class [Table](-table/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [table](table.md)| [JVM]  <br>Brief description  <br>Starts building a table.Usage:table {  <br>    header("A", "B", "C")  <br>    row(10, "some text value", 2.1f)  <br>    ...  <br>}.render(StringBuilder())  <br>Content  <br>fun [table](table.md)(init: [Table](-table/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Table](-table/index.md)  <br><br><br>

