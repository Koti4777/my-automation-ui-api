package core.java.examples.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		 String[] s3 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	
		 
		 Arrays.sort(s2);
		 for (String s:s2) {
			 System.out.println(s);
		 }
		 
		 Arrays.sort(s3,Collections.reverseOrder());
		
		 
			 System.out.println(Arrays.toString(s3));
			 
		 
	}

}
