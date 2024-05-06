package core.java.examples;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listNames = new ArrayList<>();
		listNames.add("JAVA");

		listNames.add("J2EE");

		listNames.add("JSP");

		listNames.add("SERVLETS");

		listNames.add("JAVA");

		listNames.add("STRUTS");

		listNames.add("JSP");
		System.out.println(listNames);
		HashSet<String> setNames = new HashSet<>(listNames);
		ArrayList<String> listNamesWithoutDuplicate = new ArrayList<String>(setNames);
		System.out.println(listNamesWithoutDuplicate);

	}

}
