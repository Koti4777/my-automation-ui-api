package core.java.examples.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] numbers = {1,3,4,5,2,7,6,9};
		int n = numbers.length+1;
		int sumofnumbrs = n*(n+1)/2;
		int total=0;
				
		for (int num:numbers) {
			total = total+num;
		}
		
		System.out.println(sumofnumbrs);
		System.out.println(total);
		System.out.println(sumofnumbrs-total);
	}
}
