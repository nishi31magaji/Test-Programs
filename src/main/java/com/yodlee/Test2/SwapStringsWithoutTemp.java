package com.yodlee.Test2;

public class SwapStringsWithoutTemp {
	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		a = a + b;
		System.out.println(a);
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);
		
		int c = 5;
		int d = 6;
		c = c + d;
		d = c-d;
		c = c-d;
		
		System.out.println("After : " + c + " " + d);

	}
}
