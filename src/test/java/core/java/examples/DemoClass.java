package core.java.examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoClass {

	public static void main(String[] args) {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		long currentDate = System.currentTimeMillis();
		Date date = new Date();
		System.out.println(date);
		System.out.println(dateFormat.format(currentDate));
			
		System.out.println(dateFormat.format(date));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
		System.out.println(System.getProperty("user.dir")+"//extentreports//"+new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date())+".html");
	}
}
