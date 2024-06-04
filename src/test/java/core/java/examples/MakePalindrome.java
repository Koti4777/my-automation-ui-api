package core.java.examples;

import java.util.Scanner;

public class MakePalindrome {

	public static int reverse(int input) {
		int reverse=0;
		int rem=0;
		while (input!=0) {
			rem = input%10;
			reverse = (reverse*10)+rem;
			input = input/10;
		}
		return reverse;

	}

	public static boolean isPalindrome(int input) {

		int reverse = reverse(input);
		if(reverse==input) {
			return true;
		}
		return false;
	}
	public static void reverseAndAdd(int input) {

		if (isPalindrome(input)) {
			System.out.println("given number is already palindrome");
		}else {
			while(!isPalindrome(input)) {
				int reverse = reverse(input);
				int sum = input+reverse;
				System.out.println(input +" ---- "+ reverse+"  "+sum);
				input =sum;
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");

		int inputNumber = sc.nextInt();
		reverseAndAdd(inputNumber);


	}

}
