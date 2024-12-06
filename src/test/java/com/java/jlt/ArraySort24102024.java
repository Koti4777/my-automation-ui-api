package com.java.jlt;

import java.util.Arrays;

public class ArraySort24102024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = {5,7,2,1,0,8,3,9};
		
		System.out.println("using sort logic --- "+Arrays.toString(sortLogic(numbers)));
		
		
		
	}
	
	public static int[] sortLogic(int[] input) {
		
		for (int i=0;i<input.length;i++) {
			
			for (int j=i+1;j<input.length;j++) {
				
				if (input[i]>input[j]) {
					
					int temp = input[i];
					input[i] = input[j];
					input[j] =temp;
				}
			}
		}
		
		return input;
	}

}
