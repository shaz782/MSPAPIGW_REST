package com.xius.rmsp.utilities;

import java.lang.reflect.Field;
 
public class ApiID {
	
	 private ApiID (){ }
	 
	 public static Object getValueOf( String lookingForValue)
     throws Exception {
	  
   Field field = MSPAPIGWConstants.classObject().getClass().getField(lookingForValue);

   return field.get(MSPAPIGWConstants.classObject());
 }


}
