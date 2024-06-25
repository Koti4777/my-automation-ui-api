package core.java.examples;

public class FactorialDemoRecurseve {

	public static void main(String[] args) {

		System.out.println(factorial(3));
		System.out.println(factorialLogic(1));

	}

	public static int factorial(int input) {

		if(input == 0){
			return 1;
		}
		return input*factorial(input-1);
	}
	
	public static int factorialLogic(int input) {

		int result =1;
		while(input!=0) {
			result = result*input;
			input--;
		}
		return result;
	}
}
