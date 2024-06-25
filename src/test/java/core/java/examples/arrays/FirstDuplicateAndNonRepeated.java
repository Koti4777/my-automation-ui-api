package core.java.examples.arrays;

public class FirstDuplicateAndNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Duplicate is --- "+firstDuplicate("Hello"));
		System.out.println("First Non repeated char --- "+nonRepeated("Hello"));
	}
	
	public static char firstDuplicate(String input) {
		
		char[] inputArray = input.toCharArray();
		for (int i=0;i<inputArray.length;i++) {
			for (int j=i+1;j<inputArray.length;j++) {				
				if (inputArray[i]==inputArray[j]) {					
					return inputArray[i];
					}
			}
		}
		throw new RuntimeException("didn't find any duplicate Character");		
	}

	public static char nonRepeated(String input) {
		
		char[] inputArray = input.toCharArray();
		for (int i=0;i<inputArray.length;i++) {
			for (int j=i+1;j<inputArray.length;j++) {				
				if (inputArray[i]!=inputArray[j]) {					
					return inputArray[i];
					}
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");		
	}
}
