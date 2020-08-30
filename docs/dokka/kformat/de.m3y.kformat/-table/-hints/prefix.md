//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)/[prefix](prefix.md)



# prefix  
[JVM]  
Brief description  
Defines a prefix for a column specified by the header label.  
  


## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| headerLabel| the header label specifying a column
| prefix| the value to be prefixed for each row value and given column index.
  
  
Content  
fun [prefix](prefix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  


[JVM]  
Brief description  
Defines a prefix for a column specified by the column index.  
  


## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| columnIndex| the columnIndex, starting at 0
| prefix| the value to be prefixed for each row value and given column index.
  
  
Content  
fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  


[JVM]  
Brief description  
Gets the prefix value for given column.  
  


#### Return  
the prefix value or empty.  
  
  
Content  
fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  



