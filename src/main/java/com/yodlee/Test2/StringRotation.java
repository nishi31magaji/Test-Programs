package com.yodlee.Test2;

public class StringRotation {
	public static void main(String[] args) {
		String str1 = "avajava";
		String str2 = "javaava";
        String str3 = str1 + str1;  

		if (str3.contains(str2)) {
			System.out.println("contains rotation");
		} else {
			System.out.println("does not contain rotation");
		}
	}
}
