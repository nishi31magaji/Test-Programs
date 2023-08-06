package com.yodlee.test;

public class TestClass3 {
public static void main(String[] args) {
	getVal();
}

public static String getVal() {
	int a=10,b=20;
	String val="True";
	if(a<b) {
		System.out.println("False");
		return "FALSE";
	}
	System.out.println("other flow");
	return val;
}
}
