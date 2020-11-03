//[kformat](../../../index.md)/[de.m3y.kformat](../../index.md)/[Table](../index.md)/[Hints](index.md)/[postfix](postfix.md)



# postfix  
[JVM]  
Content  
fun [postfix](postfix.md)(headerLabel: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), postfix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


Defines a postfix for a column specified by the header label.

  


[JVM]  
Content  
fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), postfix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


Defines a postfix for a column specified by the column index.



## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>columnIndex| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>the columnIndex, starting at 0<br><br>
| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>postfix| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>the value to be post-fixed to each row value and given column index.<br><br>
  
  


[JVM]  
Content  
fun [postfix](postfix.md)(columnIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  
More info  


Gets the postfix for given column, or an empty string if not set.



#### Return  


the postfix value or empty string (if not set)



## Parameters  
  
JVM  
  
|  Name|  Summary| 
|---|---|
| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int/PointingToDeclaration/"></a>columnIndex| <a name="de.m3y.kformat/Table.Hints/postfix/#kotlin.Int/PointingToDeclaration/"></a><br><br>the columnIndex, starting at 0<br><br>
  
  



