package studentdb.model;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private int marks;
	
	public Student(int rollNo, int marks) {
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public int getRollNo() { return rollNo; }
	public int getMarks() { return marks; }
	
	@Override
	public String toString() {
		String objStr = "Student(";
		
		objStr += "rollNo: " + rollNo;
		objStr += ", marks: " + marks;
		
		objStr += ")";
		return objStr;
	}
}
