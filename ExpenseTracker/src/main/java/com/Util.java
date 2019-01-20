/**
 * 
 */
package com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.*;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * @author Santhosh
 *
 */
public class Util {
	
	/**
	 * Method to check given object is null or not
	 * @param obj
	 * @return
	 */
	 public static boolean isNull(Object obj) {
	        return null == obj ? true : false;
	    }
	 
	 /**
	  * Method to fetch current timestamp
	  * @return
	  */
	  public static Timestamp getCurrentTimeStamp() {
	        SimpleDateFormat timeStampFormat = new SimpleDateFormat(
	                "yyyy-MM-dd HH:mm:ss.SSS");

	        String timeStamp = timeStampFormat.format(Calendar.getInstance()
	                .getTime());
	        Timestamp ts = Timestamp.valueOf(timeStamp);
	        return ts;
	    }
	  
	  /**
	   * Method to encrypt given string
	   */
	  public static String encrpyData(String str){
		  String encrpytedStr=null;
		  if(!Util.isNull(str) && str.length()>0){
			  encrpytedStr= BCrypt.hashpw(str, BCrypt.gensalt()); 
		  }
		return encrpytedStr;
	  }
	  
	  /**
	   * Method to check whether encrypted data and given data is same or not
	   */
	  public static boolean decryptData(String currentStr,String encryptedStr){		 
		  if(!Util.isNull(currentStr) && currentStr.length()>0
				  && !Util.isNull(encryptedStr) && encryptedStr.length()>0){
			  return BCrypt.checkpw(currentStr, encryptedStr);
		  }
		return false;
	  }
}
