package core.java.examples;

public class DecimalToBinary24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(50));
		System.out.println(binaryToDecimal(decimalToBinary(50)));
	}

	public static String decimalToBinary(int input) {
		String decimal = "";
		while(input>0) {
			int rem = input%2;
			decimal = rem+decimal;
			input = input/2;
		}
		
		return decimal;
	}
	
	public static int binaryToDecimal(String input) {
		
		
		return Integer.parseInt(input, 2);
	}
}
