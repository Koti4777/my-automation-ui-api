package com.java.examples.oops;

public class EncapulationDemo {
int id;
int marks;
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printValues(3,5,"Hello");
	}
	public int getId() {
		System.out.println(id);
		return id;
	}
	public int getMarks() {
		System.out.println(marks);
		return marks;
	}
	public String getName() {
		System.out.println(name);
		return name;
	}
	private void setId(int id) {
		this.id = id;
	}
	private void setMarks(int marks) {
		this.marks = marks;
	}
	private void setName(String name) {
		this.name = name;
	}
public static void printValues(int input1, int input2, String input3) {
	EncapulationDemo demo = new EncapulationDemo();
	
	demo.setId(input1);
	demo.setMarks(input2);
	demo.setName(input3);
	demo.getId();
	
}
}
