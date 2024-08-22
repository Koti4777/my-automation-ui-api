package com.practice.two;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] one = {"one", "two","three","four","five"};
		String[] two = {"three","four","five","six","sevem"};
		Set<String> firstSet = new LinkedHashSet<>(Arrays.asList(one));
		Set<String> secondSet = new LinkedHashSet<>(Arrays.asList(two));
		
		System.out.println(Arrays.toString(one));
		System.out.println(Arrays.toString(two));
		firstSet.retainAll(secondSet);
		System.out.println(firstSet.toString());
		
		
	}

}
