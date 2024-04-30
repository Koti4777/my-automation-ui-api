package core.java.examples;

public class StringDemo {
	/*
	 * this class for string manipulations 1. to get the char 2. string reverse
	 */
	public static char getChar(String input, int index) {
		if (index<0 || index>= input.length()) {
			throw new StringIndexOutOfBoundsException("Index is not in range");
			
		}
		
		return input.charAt(index);
	}
	
	public static String reverseString(String input) {
		StringBuilder sb = new StringBuilder(input);		
		sb.reverse();
		return sb.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getChar("HelloEveryone", 3));
		System.out.println(reverseString("HelloEveryone"));
	}

}
