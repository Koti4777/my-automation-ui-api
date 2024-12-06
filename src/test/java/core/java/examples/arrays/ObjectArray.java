package core.java.examples.arrays;

import java.util.Arrays;

public class ObjectArray {
	String name;
	int age;
	double height;
	public ObjectArray(String name, int age, double height) {
		name=this.name;
		age=this.age;
		height=this.height;
		
	}

	public static void main(String[] args) {
		
		ObjectArray obj1 = new ObjectArray("Koti", 35, 5.5);
		ObjectArray obj2 = new ObjectArray("Ram", 35, 6.0);
		ObjectArray obj3 = new ObjectArray("Virat", 30, 5.6);
		
		ObjectArray[] objArray = new ObjectArray[3];
		
		objArray[0]=obj1;
		objArray[1]=obj2;
		objArray[2]=obj3;
		
		System.out.println(Arrays.deepToString(objArray));

		
		Object[] objectArray = { "Hello", 123, true };
        System.out.println(Arrays.toString(objectArray));
	}
}
