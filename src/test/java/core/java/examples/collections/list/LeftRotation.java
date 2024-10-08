package core.java.examples.collections.list;

import java.util.Arrays;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 5, 7, 9};
		int[] input = {1};
		int k =14;		
		//System.out.println(arr[(i + mod) % n]);		
		System.out.println(Arrays.toString(leftRotate(arr,k)));
		System.out.println(Arrays.toString(leftRotate(input,k)));
	}
	
	public static int[] leftRotate(int[] a, int n){
		
		if (a.length<=1 || n<1)
			return a;
		
		int len = a.length;
		int mod = n%len;
		int[] result = new int[len];
		
		for (int i=0;i<a.length;i++) {
			
			result[i] = a[(i+mod)%len];
		}
				
		return result;		
	}

}
