package com.yodlee.test;

public class Test6 {
public static void main(String[] args) {
	String a = "True";
	System.out.println(!Boolean.valueOf(a));
	System.out.println(((true && false)|| true));
	if ((true && false)|| true) {
		System.out.println("Ok");
	}
	
	Integer c=null;
	long ab = Long.valueOf(c);
System.out.println(Long.valueOf(ab));	
}
}
