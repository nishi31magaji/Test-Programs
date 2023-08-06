package com.yodlee.Test2;

public class TestExceptionPropogation2 {

void m()  {
	throw new RuntimeException("device error");
}
void n() {
	m();
}
void p() {
	try {
		n();
	}
	catch(Exception e) {
		System.out.println("Exception handled");
	}
}
public static void main(String[] args) {
	TestExceptionPropogation2 obj = new TestExceptionPropogation2();
	obj.p();
	System.out.println("normal flow");
}
}
