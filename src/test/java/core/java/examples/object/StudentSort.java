package core.java.examples.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;



public class StudentSort {
	static // compare with student Id
	Comparator<StudentInfo> idCompare = new Comparator<StudentInfo>() {

		@Override
		public int compare(StudentInfo s1, StudentInfo s2) {
			// TODO Auto-generated method stub
			return s1.id-s2.id;
		}
	};
	// compare with student Id
	static Comparator<StudentInfo> marksCompare = new Comparator<StudentInfo>() {

		@Override
		public int compare(StudentInfo s1, StudentInfo s2) {
			// TODO Auto-generated method stub		
			return s2.marks-s1.marks;// desc order
		}
	};
	
	
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
		Collections.sort(studentRecords, marksCompare);

		for (StudentInfo stu:studentRecords) {
			System.out.println(stu.id+"---"+stu.name+"---"+stu.marks);
		}
		System.out.println("Sort by Name");
		Collections.sort(studentRecords, new NameCompare());
		for (StudentInfo stu:studentRecords) {
			System.out.println(stu.id+"---"+stu.name+"---"+stu.marks);
		}

		System.out.println("Sort by ID");
		Collections.sort(studentRecords, idCompare);
		for (StudentInfo stu:studentRecords) {
			System.out.println(stu.id+"---"+stu.name+"---"+stu.marks);
		}
	}	

}
