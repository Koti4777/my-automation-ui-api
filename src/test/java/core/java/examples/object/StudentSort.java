package core.java.examples.object;

import java.util.ArrayList;
import java.util.Collections;



public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1 = new StudentInfo("Hari", 90,4);
		StudentInfo s2 = new StudentInfo("Krishna", 80,3);
		StudentInfo s3 = new StudentInfo("Krishna", 70,1);
		StudentInfo s4 = new StudentInfo("Ram", 95,2);
		ArrayList<StudentInfo> studentRecords = new ArrayList<>();
		studentRecords.add(s2);
		studentRecords.add(s1);
		studentRecords.add(s3);
		studentRecords.add(s4);
		System.out.println("Sort by Marks");
		Collections.sort(studentRecords, new MarksCompare());

		for (StudentInfo stu:studentRecords) {
			System.out.println(stu.id+"---"+stu.name+"---"+stu.marks);
		}
		System.out.println("Sort by Name");
		Collections.sort(studentRecords, new NameCompare());
		for (StudentInfo stu:studentRecords) {
			System.out.println(stu.id+"---"+stu.name+"---"+stu.marks);
		}

		System.out.println("Sort by ID");
		Collections.sort(studentRecords, new IdCompare());
		for (StudentInfo stu:studentRecords) {
			System.out.println(stu.id+"---"+stu.name+"---"+stu.marks);
		}
	}

}
