package core.java.examples.strings;

public class CountCharWithoutLoop {

	public static void main(String[] args) {
		/*
		 * // Write a Java program to count the total number of occurrences of a given
		 * character in a string without using any loop?
		 */
System.out.println(countChar("aaHelloworldaheloa"));
String s1= "Hello World!";
System.out.println(s1);
String copyOfs1 = s1.replaceAll("\\s", "");
System.out.println(copyOfs1);
		
	}

	public static int countChar(String input) {
		
		int count;
		
		return count = input.length()-input.replace("a", "").length();
		
		
	}
}
