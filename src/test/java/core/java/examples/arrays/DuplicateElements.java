package core.java.examples.arrays;

import java.util.HashSet;

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
	}

}
