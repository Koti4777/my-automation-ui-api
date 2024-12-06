package core.java.examples.arrays;

import java.util.Arrays;

public class SringArraySortwithOutLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		 
		 for (int i=0;i<s2.length;i++) {
			 for (int j=i;j<s2.length;j++) {
				 
				 if (s2[i].compareTo(s2[j])>0) {
					 
					 String temp = s2[i];
					 s2[i]=s2[j];
					 s2[j]=temp;
					 
				 }
			 }
		 }
		 
		 for (String val:s2) {
			 System.out.println(val);
		 }
		 
		System.out.println(Arrays.toString(s2));
	}

}
