package core.java.examples;

import java.util.HashMap;

public class CountOccurrences {

	public static void main(String[] args) {
		// updated in feature to fetch in master
		int[] numbers =  {12, 9, 12, 9, 10, 9, 10, 11};
		HashMap<Integer,Integer> numMap = new HashMap<>();
		System.out.println(numMap);
		for (int i=0;i<numbers.length;i++) {
			if(!numMap.containsKey(numbers[i])) {
				numMap.put(numbers[i], 1);
			}else {
				numMap.put(numbers[i], numMap.get(numbers[i])+1);				
			}
			
		}
		System.out.println("Element Count : "+numMap);
		
		String s = "Be mindful of unwanted touching or gugsb";
		char[] chArray = s.toCharArray();
		HashMap<Character,Integer> chMap = new HashMap<>();
		
		for (int i=0;i<chArray.length;i++) {
			if(!chMap.containsKey(chArray[i])) {
				chMap.put(chArray[i], 1);
			}else {
				chMap.put(chArray[i], chMap.get(chArray[i])+1);				
			}
			
		}
		System.out.println("char Count : "+chMap);
		
	}

}
