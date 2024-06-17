package core.java.examples.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class UniqueValues {
// using set removed duplicates converted set to array manually and returned output array
	public static int[] returnUniqueValues(int[] input) {
		LinkedHashSet<Integer> numberSet = new LinkedHashSet<Integer>();
		for (int i=0;i<input.length;i++) {
			numberSet.add(input[i]);
			}
		System.out.println(numberSet.toString()+" --- number set");
		int[] output = new int[numberSet.size()];
		int index =0;
		for (Integer num:numberSet) {			
			output[index]=num;
			index++;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		// removing duplicates from array using Linked hash map and keySet from Maps interface

		
		
		int[] input = {1,5,9,4,7,2,1,5};
		System.out.println("Calling from Function"+ Arrays.toString(returnUniqueValues(input)));
	
		LinkedHashMap<Integer,Integer> numbersMap = new LinkedHashMap<Integer,Integer>();
		for (int i=0;i<input.length;i++) {
			numbersMap.put(input[i], i);
		}
		System.out.println("using maps and keySet");
		System.out.println(numbersMap.keySet());
		System.out.println(numbersMap);
	
	
			
		
	}
}
