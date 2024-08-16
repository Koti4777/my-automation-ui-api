package core.java.hackerrank;

import java.util.Stack;

public class Demo1 {
	

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println(repeatStringCount("abc",10));
}

public static long repeatStringCount(String input, long n) {
	
	StringBuilder sbr = new StringBuilder();
	long charCount=0;
	while (sbr.length()<n) {
		sbr.append(input);
	}
	for (int i = 0;i<n;i++) {
		if (sbr.charAt(i)=='a') {
			charCount++;
		}
	}
	
	return charCount;

}
}

