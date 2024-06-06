package core.java.examples.object;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1 = new StudentInfo("Zari", 90);
		StudentInfo s2 = new StudentInfo("Krishna", 80);
		StudentInfo s3 = new StudentInfo("Krishna", 70);
		StudentInfo s4 = new StudentInfo("Ram", 95);
		 ArrayList<StudentInfo> studentRecords = new ArrayList<>();
		 studentRecords.add(s2);
		 studentRecords.add(s1);
		 studentRecords.add(s3);
		 studentRecords.add(s4);
		 Collections.sort(studentRecords, new MarksCompare());
		 for (StudentInfo stu:studentRecords) {
			System.out.println(stu.name+"---"+stu.marks);
		 }
		 
		 Collections.sort(studentRecords, new NameCompare());
		 for (StudentInfo stu:studentRecords) {
			System.out.println(stu.name+"---"+stu.marks);
		 }
	}

}
