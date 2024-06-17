package core.java.examples.object;

public class StudentInfo {

	String name;
	int marks;
	int id;
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	private void setMarks(int marks) {
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	public StudentInfo(String name, int marks, int id) {
		setName(name);
		setMarks(marks);
		setId(id);
	
	}
	
}
