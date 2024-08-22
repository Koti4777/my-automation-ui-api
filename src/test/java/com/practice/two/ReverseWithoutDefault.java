package com.practice.two;

public class ReverseWithoutDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(null));	
		System.out.println(reverseUsingWhile("HelloWorld!!!"));

	}

	public static String reverse(String input) {
		if(input==null)
			return input;
		StringBuilder sb = new StringBuilder();
		for (int i=(input.length()-1);i>=0;i--) {
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseUsingWhile(String input) {
		if(input==null || input.isEmpty())
			return input;
		char[] charArray = input.toCharArray();
		int start=0;
		int end= charArray.length-1;
		while (start<end) {
			char temp = charArray[end];
			charArray[end]=charArray[start];
			charArray[start]=temp;
			start++;
			end--;
		}
		return new String(charArray);
	}

}
