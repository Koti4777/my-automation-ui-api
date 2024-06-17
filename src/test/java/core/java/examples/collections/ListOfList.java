package core.java.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ArrayList<String>> listOfList = new ArrayList<>();
		ArrayList<String> aList1 = new ArrayList<>();
		ArrayList<String> aList2 = new ArrayList<>();
		aList1.add("one");
		aList1.add("two");
		aList1.add("three");
		aList2.add("four");
		aList2.add("five");
		aList2.add("sex");
		listOfList.add(aList1);
		listOfList.add(aList2);
		
		System.out.println(listOfList.toString());
		String[] sArray = new String[] {"hello", "world","!"};
		char[] cArray = new char[] {'a','e','i','o','u'};
		System.out.println(String.valueOf(aList2));
		System.out.println(String.valueOf(aList1));
		System.out.println(String.valueOf(listOfList));
		System.out.println(String.valueOf(sArray));
		System.out.println(String.copyValueOf(cArray, 1, 4));
		System.out.println(String.valueOf(cArray, 1, 4));
		
		
	}

}
