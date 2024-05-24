package core.java.examples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {

	public static void dupliacteElements(int[] inputArray) {
		
		HashSet<Integer> inputSet = new HashSet<>();
		System.out.println("Duplicate elements");
		for (int element:inputArray) {
			if(!inputSet.add(element)) {
				System.out.println(element);
				
				
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dupliacteElements(new int[] {111, 333, 555, 777, 333, 444, 555});
		
		String[] one = new String[] {"hello","one"};
		List<String> aList = new ArrayList<>();
	aList = Arrays.asList(one);
		
	}

}
