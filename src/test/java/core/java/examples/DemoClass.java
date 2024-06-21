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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dateFormat.format(date));
		
	}
}
