package com.yodlee.Test2;

public class SchoolStudent {
	private String name;
	private String lastName;
	private String email;
	
	public SchoolStudent(String name,String lastName,String email) {
		this.name=name;
		this.lastName=lastName;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "SchoolStudent [name=" + name + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
