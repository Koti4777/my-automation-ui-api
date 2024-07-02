package core.java.examples;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DemoClass {

	public static int factorial(int input) {
		
		if (input==0) {
			return 1;		}		
		
		return input* factorial(input-1);
	}
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.min(5, 4));
		System.out.println(Math.max(5, 4));
		
	}

}