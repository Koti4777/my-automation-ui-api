package core.java.examples.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,5,6,7,2,9};
		System.out.println(Arrays.toString(numbers));
		int temp;
		for (int i=0;i<numbers.length/2;i++) {

			temp = numbers[i];
			numbers[i]= numbers[numbers.length-1-i];
			numbers[numbers.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
