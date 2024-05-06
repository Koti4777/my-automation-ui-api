package core.java.examples;

public class NumberOrNot {
	public static boolean numberCheck(String input) {
		try {
			int i = Integer.parseInt(input);
			System.out.println("Input is = "+i);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numberCheck("7"));
		System.out.println(numberCheck("Hello"));
	}

}
