package com.practice.two;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one = "First";
		String two = "Two";
		String four = "Two";
		
		two = one+two;
		one = two.substring(5);
		two=two.substring(0, 5);
		System.out.println(one);
		System.out.println(two);
		String three = new String("Two");
		System.out.println(one.equals(three));
		System.out.println(one==three);
		System.out.println(one==four);
	}

}
