package core.java.examples;

import java.util.Arrays;

public class ReverseStringWithPreservingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "TODO Auto-generated method stub";
		char[] chArray = input.toCharArray();
		char[] result = new char[chArray.length];
		int j = result.length-1;
		
		for (int i=0;i<chArray.length;i++) {
			if (chArray[i]==' ') {
				result[i]=' ';
			}
		}
		System.out.println(String.valueOf(result));	
		for (int i=0;i<chArray.length;i++) {
			if(chArray[i]!=' ') {
				if (result[j]==' ') {
					
					j--;// Already spaces added hence doing -- if equals to ' '
				}
					result[j]=chArray[i];
					j--;
				
				
			}
		}
		System.out.println(String.valueOf(result));	
	}
}
