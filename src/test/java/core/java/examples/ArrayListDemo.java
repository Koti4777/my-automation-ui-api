package core.java.examples;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<>();

System.out.println(list.isEmpty());

list.add("JAVA");

list.add("J2EE");

list.add("JSP");

list.add("JAVA");

list.add("SERVLETS");

list.add("JAVA");

list.add("STRUTS");
		
System.out.println(list);

for (String l:list) {
	
	System.out.println(l);
}

	}
	
}
