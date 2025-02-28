package com.java.Int;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Calendar calendar = new GregorianCalendar();
	        
	        // Convert to Date
	        Date date = calendar.getTime();
System.out.println(date);
	        // Format the date
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String formattedDate = sdf.format(date);

	        // Display the formatted date
	        System.out.println(formattedDate);
	}

}
