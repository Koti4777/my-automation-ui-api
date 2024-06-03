package core.java.examples.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SeparateZerosFromNonZeros23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,5,7,9,0,2,0,0,1,0};
		
		System.out.println("Before----"+Arrays.toString(numbers));
		
		
		int count =0;
		for (int i=0;i<numbers.length;i++) {			
			if (numbers[i]!=0) {
				numbers[count]=numbers[i];
				count++;
			}			
		}
		while(count<numbers.length) {
			numbers[count]=0;
			count++;
		}
		System.out.println("After----"+Arrays.toString(numbers));
	}

}
