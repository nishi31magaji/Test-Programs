package com.yodlee.Test2;

public class ProxyDesignPattern {
public static void main(String[] args) {
	EmpDao dao = new EmpDaoImplProxy("Admin");
	try {
		dao.createUser();
		dao.deleteUser();

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
