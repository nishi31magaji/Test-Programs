package com.yodlee.Test2;

public class SchoolStudentAdapter implements Student{

	private SchoolStudent schoolStudent;
	public SchoolStudentAdapter(SchoolStudent schoolStudent) {
		this.schoolStudent = schoolStudent;
	}

	public String getName() {
		return schoolStudent.getName();
	}
	
	public String getLastName() {
		return schoolStudent.getLastName();
	}
	
	public String getEmail() {
		return schoolStudent.getEmail();
	}
	
}
