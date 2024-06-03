package core.java.examples.arrays;

public class LeadersArray25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {14, 9, 11, 7, 8, 5, 3};
		System.out.println("Leaders");
		for (int i=0;i<numbers.length;i++) {
			boolean flag = true;
			for (int j=i+1;j<numbers.length;j++) {
				
				if (numbers[i]<numbers[j]) {
					//System.out.println("came to if "+i);
					flag=false;					
				}				
			}
			if(flag) {
				System.out.println(numbers[i]+" is Leader");// from feature rebase demo
			}
		}
		
	}

}
