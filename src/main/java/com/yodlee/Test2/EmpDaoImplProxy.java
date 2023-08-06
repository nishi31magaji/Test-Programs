package com.yodlee.Test2;

public class EmpDaoImplProxy implements EmpDao {
	private String role;
	private EmpDaoImpl empDaoImpl;

	public EmpDaoImplProxy(String role) {
		empDaoImpl = new EmpDaoImpl();
		this.role = role;
	}

	@Override
	public void createUser() throws Exception {
		if (role.equals("Admin")) {
			empDaoImpl.createUser();
		}
		else {
			throw new Exception("Access denied");
		}

	}

	@Override
	public void deleteUser() throws Exception {
		if (role.equals("Admin")) {
			empDaoImpl.deleteUser();
		}
		else {
			throw new Exception("Access denied");
		}
	}

}
