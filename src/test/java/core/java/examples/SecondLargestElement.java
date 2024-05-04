package core.java.examples;

public class SecondLargestElement {

	public static int secondLargest(int[] input) {
		
		int firstLargest=0;
		int secondLargest=0;
		
		if (input[0]>input[1]) {
			
			firstLargest=input[0];
			secondLargest=input[1];
		}else {
			firstLargest=input[1];
			secondLargest=input[0];
		}
		
		for (int i=2;i<input.length;i++) {
			
			if (input[i]<firstLargest && input[i]>secondLargest) {
				secondLargest = input[i];
				}
			else if (input[i]>firstLargest){
				secondLargest = firstLargest;
				firstLargest = input[i];
			}
		}
		
		return secondLargest;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secondLargest(new int[] {1,20,1,2,3,4,5}));
	}

}
