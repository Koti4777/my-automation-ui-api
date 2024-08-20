package core.java.hackerrank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;

public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(repeatStringCount("aba",10));
	String dateName1 = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	System.out.println(dateName1);
		
	}

	public static long repeatStringCount(String input, long n) {

		StringBuilder sbr = new StringBuilder();
		long charCount=0;
		while (sbr.length()<n) {
			sbr.append(input);
		}
		System.out.println(sbr.toString());
		for (int i = 0;i<n;i++) {
			if (sbr.charAt(i)=='a') {
				charCount++;
			}
		}

		return charCount;

	}
}

