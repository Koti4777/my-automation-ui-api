package core.java.examples;

public class StringDemo {

	public static char getChar(String input, int index) {
		if (index<0 || index>= input.length()) {
			throw new StringIndexOutOfBoundsException("Index is not in range");
		}
		
		return input.charAt(index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getChar("HelloEveryone", 3));
		System.out.println(getChar("HelloEveryone", 30));
	}

}
