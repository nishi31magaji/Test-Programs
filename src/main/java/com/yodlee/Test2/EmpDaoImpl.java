package com.yodlee.Test2;

public class EmpDaoImpl implements EmpDao {

	@Override
	public void createUser() {
		System.out.println("User has been created");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("User has been deleted");
	}

}
