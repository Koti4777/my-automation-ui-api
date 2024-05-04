package core.java.examples.arrays;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] sArray1 = {"one", "two", "three"};
String[] sArray2 = {"one", "two", "three", "four"};
String[] sArray3 = {"one", "two", "three"};

System.out.println(Arrays.equals(sArray1, sArray3));
System.out.println(Arrays.equals(sArray1, sArray2));
	}

}
