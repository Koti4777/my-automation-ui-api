package core.java.examples.strings;

public class StringReverse {

	public static String reverseString(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		return sb.toString();
	}

	public static String reverseStringRecursive(String input) {

		if (input == null || input.length()<=1) {
			return input;
		}
		return reverseStringRecursive(input.substring(1)) + input.charAt(0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("Hello"));
		System.out.println(reverseStringRecursive("Hello"));

		String str = "world";
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,4));

	}

}
