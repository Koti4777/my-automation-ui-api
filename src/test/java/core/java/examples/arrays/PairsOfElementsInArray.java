package core.java.examples.arrays;

public class PairsOfElementsInArray
{
	/* 
	 * this Program selects the pair of nums from the givien array to satifie conditions
	 *  */
    static void findThePairs(int inputArray[], int inputNumber)
    {
        for (int i=0;i<inputArray.length;i++) {
        	for (int j=i+1;j<inputArray.length;j++) {
        		
        		if (inputArray[i]+inputArray[j]==inputNumber) {
        			
        			 System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
        		}
        	}
        }
    }
 
    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20,5}, 10);
 
		/*
		 * findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
		 * 
		 * findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
		 * 
		 * findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
		 */
    }
}