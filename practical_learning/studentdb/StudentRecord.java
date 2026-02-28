package studentdb;

import studentdb.model.*;

public class StudentRecord {
	public static void main(String[] args) {
		manager = new StudentRecordManager(dbFile);
		manager.listRecord();
	}
	
	private static StudentRecordManager manager;
	private static final String dbFile = "database\\studentdb.dat";
}
