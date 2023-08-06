package com.yodlee.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class AddPrefixSufixString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String givenString = sc.next();
	sc.close();
	StringJoiner sj = new StringJoiner(",", "#", "#");
	sj.add(givenString);
	sj.add("hello");
	sj.add("java8");
	
}
}
