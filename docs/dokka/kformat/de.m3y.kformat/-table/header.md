//[kformat](../../index.md)/[de.m3y.kformat](../index.md)/[Table](index.md)/[header](header.md)



# header  
[JVM]  
Brief description  
Sets the header labels.Note: Replaces any previous values.  
  


#### Return  
the list of labels.  
  
  
Content  
fun [header](header.md)(vararg labels: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<Out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  
fun [header](header.md)(labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  


[JVM]  
Brief description  
Gets the label of the header at given index.  
  


#### Return  
the label or index  out of bounds exception  
  


## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| columnIndex| header label index
  
  
Content  
fun [header](header.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  


[JVM]  
Brief description  
Gets current header labels.  
  


#### Return  
a list of current header labels.  
  
  
Content  
fun [header](header.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  



