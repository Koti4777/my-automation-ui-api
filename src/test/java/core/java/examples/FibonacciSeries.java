package core.java.examples;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the positive number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int first =0;
		int second=1;
		int third=0;
		while (third<input) {
			third = first+second;
			first = second;
			second = third;
		}
		if (third==input) {
			System.out.println("given number is fibonaccinumber");
		}else {
			System.out.println("Given number is not fibonaccinumber");
		}
	}

}
