package core.java.examples.arrays;

import java.util.Arrays;

public class SubStringFromIndex {
	public static String subString(String input) {

		char[] chArray = input.toCharArray();
		String output=null;

		for (int i=0;i<chArray.length-3;i++) {
			

			if (chArray[i]=='t'&&chArray[i+1]=='e' &&chArray[i+2]=='s'&&chArray[i+3]=='t'){
				char[] newArray = new char[chArray.length-i];				
				
				
				  for (int j=i;j<chArray.length;j++) { 
				  newArray[j-i]=chArray[j]; }
				 
				/*
				 * while(j<chArray.length) {
				 * 
				 * newArray[j-i]=chArray[j]; j++; }
				 */
				output =  String.valueOf(newArray);
				System.out.println(output);
				break;
			
			}
			
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(subString("Automation testing is Good"));
	}	
}
