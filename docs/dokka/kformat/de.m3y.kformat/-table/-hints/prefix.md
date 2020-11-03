//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)/[prefix](prefix.md)



# prefix  
[JVM]  
Content  
fun [prefix](prefix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


Defines a prefix for a column specified by the header label.



## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>headerLabel| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>the header label specifying a column<br><br>
| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>prefix| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>the value to be prefixed for each row value and given column index.<br><br>
  
  


[JVM]  
Content  
fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


Defines a prefix for a column specified by the column index.



## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>columnIndex| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>the columnIndex, starting at 0<br><br>
| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>prefix| <a name="de.m3y.kformat/Table.Hints/prefix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>the value to be prefixed for each row value and given column index.<br><br>
  
  


[JVM]  
Content  
fun [prefix](prefix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  
More info  


Gets the prefix value for given column.



#### Return  


the prefix value or empty.

  



