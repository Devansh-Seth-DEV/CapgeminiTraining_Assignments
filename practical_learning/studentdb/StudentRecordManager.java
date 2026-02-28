package studentdb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import studentdb.model.Student;

public class StudentRecordManager {
	public StudentRecordManager(String dbFile) {
		this.dbFile = dbFile;
		this.record = new HashMap<>();
		
		try (FileInputStream fin = new FileInputStream(dbFile);
			 ObjectInputStream ois = new ObjectInputStream(fin)) {
			Object obj = ois.readObject();
			
			if (obj instanceof HashMap) {
				record = (HashMap<Integer, Student>) obj;
				System.out.println("Record loaded successfully.");
			}
			else System.out.println("Unable to load record!");
				
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Student findStudent(int rollNo) {
		return record.get(rollNo);
	}
	
	public void addRecord(Student s) {
		record.put(s.getRollNo(), s);
		System.out.println("Added Record: " + s.toString());
	}
	
	public void saveRecord() {
		try (FileOutputStream fout = new FileOutputStream(dbFile);
			 ObjectOutputStream oos = new ObjectOutputStream(fout)) {
			
			oos.writeObject(record);
			System.out.println("Data Saved Successfully!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void listRecord() {
		System.out.println("RECORDS:");
		String cellLine =  "+--------+-------+";
		
		System.out.println(cellLine);
		System.out.println("| ROLLNO | MARKS |");
		System.out.println(cellLine);
		
		for(Student s: record.values()) {
			System.out.println("| "
						       + s.getRollNo()
						       + " \t | "
						       + s.getMarks()
						       + " \t |");
			
			System.out.println(cellLine);
		}
	}
	
	private String dbFile;
	private HashMap<Integer, Student> record = null;
}
