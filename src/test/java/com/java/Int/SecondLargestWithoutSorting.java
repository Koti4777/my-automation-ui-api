package com.java.Int;

public class SecondLargestWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,1,4,5,8,2,9,-1};
		int[] input1 = {0,-1,-4,-6};
		int[] input2 = {0,0,0,0};
		System.out.println(secondLargestLogic(input));
		System.out.println(secondLargestLogic(input1));
		System.out.println(secondLargestLogic(input2));
	}

	public static int secondLargestLogic(int[] input) {

		int firstLargest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		

		for  (int i =0;i<input.length;i++) {

			/*	if (firstLargest==secondLargest) {
				firstLargest=input[i];
			}else {*/
			if (firstLargest<input[i]) {
				secondLargest=firstLargest;
				firstLargest=input[i];
			}else if (secondLargest<input[i]){
				secondLargest=input[i];
			}
			//}
		}



		return secondLargest;
	}

}
