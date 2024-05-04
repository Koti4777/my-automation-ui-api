package core.java.examples;

public class SumOfAllDegits {

	
	public static int sumOfDigits(int input) {
		
		int sum=0;
		while (input!=0) {
			sum+=input%10;
			input=input/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sumOfDigits(123));
	}

}
