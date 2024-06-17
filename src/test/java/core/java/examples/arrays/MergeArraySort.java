package core.java.examples.arrays;

import java.util.Arrays;

public class MergeArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arrayA = new int[] {-7, 12, 17, 29, 41, 56, 79};
         
	        int[] arrayB = new int[] {-9, -3, 0, 5, 19};
	        int[] result = new int[arrayA.length+arrayB.length];
	      
	        
	        int i=0, j=0, k=0;
	         
	        while (i < arrayA.length && j < arrayB.length)
	        {
	            if (arrayA[i] < arrayB[j]) 
	            {
	                result[k] = arrayA[i];
	                i++;
	                k++;
	            } 
	            else
	            {
	                result[k] = arrayB[j];
	                j++;
	                k++;
	            }
	        } 
	        
	        System.out.println(Arrays.toString(result));
	}

}
