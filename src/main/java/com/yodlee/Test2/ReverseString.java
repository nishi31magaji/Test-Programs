package com.yodlee.Test2;

public class ReverseString {
public static void main(String[] args) {
	String str = "this is javatpoint";
	String newStr = "";
	for(int i =str.length()-1;i>=0;i--) {
		newStr = newStr + str.charAt(i);
	}
	System.out.println(newStr);
	if(str.equals(newStr)) {
		System.out.println("String is Palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
	
	String capita[] = str.split(" ");
	for(String word:capita) {
	}
}
}
