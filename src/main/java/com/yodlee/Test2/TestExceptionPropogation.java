package com.yodlee.Test2;

import java.io.IOException;

public class TestExceptionPropogation {

void m() throws IOException {
	throw new IOException("device error");
}
void n() throws IOException {
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
	TestExceptionPropogation obj = new TestExceptionPropogation();
	obj.p();
	System.out.println("normal flow");
}
}
