package core.java.examples;

import java.util.HashMap;

public class DemoClass {

	public static void main(String[] args) {
		 int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555,444,111};
		 
		 for (int i=0;i<inputArray.length;i++) {
			 for (int j=i+1;j<inputArray.length;j++) {
				 if (inputArray[i]==inputArray[j]) {
					 System.out.print("Duplicate Elements:"+inputArray[i]+"\t");
				 }
			 }
		 }
	}
}
