package core.java.examples.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] intArray = new int[] {1,5,2,4,8,9,0};
		String[] intArray1 =   {"One", "two","three","four"};
		int[] intArray2 = new int[5];
		int temp=0;
		
		for (int i=0;i<intArray.length;i++) {
		
			for (int j=i+1;j<intArray.length;j++) {
				
				if (intArray[i]>intArray[j]) {
					temp = intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(intArray));
		for (int ar:intArray) {
			
		}
		
		Arrays.sort(intArray1, Collections.reverseOrder());
		
	}

}
