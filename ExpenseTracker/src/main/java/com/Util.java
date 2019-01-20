/**
 * 
 */
package com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Santhosh
 *
 */
public class Util {
	 public static boolean isNull(Object obj) {
	        return null == obj ? true : false;
	    }
	  public static Timestamp getCurrentTimeStamp() {
	        SimpleDateFormat timeStampFormat = new SimpleDateFormat(
	                "yyyy-MM-dd HH:mm:ss.SSS");

	        String timeStamp = timeStampFormat.format(Calendar.getInstance()
	                .getTime());
	        Timestamp ts = Timestamp.valueOf(timeStamp);
	        return ts;
	    }
}
