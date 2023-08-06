package com.yodlee.Test2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
public static void main(String[] args) {
	List<Student>studentList = new ArrayList<Student>();
	CollegeStudent s1 = new CollegeStudent("rishan", "deshmukh", "rd@gmail.com");
	CollegeStudent s2 = new CollegeStudent("nidhi", "A", "na@gmail.com");
	SchoolStudent s4 = new SchoolStudent("riya", "A", "ra@gmail.com");
	SchoolStudentAdapter s3 = new SchoolStudentAdapter(s4);
	studentList.add(s1);
	studentList.add(s2);
	studentList.add(s3);
	System.out.println(studentList);

	for(Student student:studentList) {
		System.out.println(student.getName());

	}

	
}
}
