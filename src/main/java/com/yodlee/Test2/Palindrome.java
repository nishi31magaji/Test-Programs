package com.yodlee.Test2;

public class Palindrome {
public static void main(String[] args) {
	System.out.println(isPalindrome("nitin"));
	System.out.println(isPalindrome("nishi"));
	
}

public static boolean isPalindrome(String str) {
	String reverse = "";
	char[] array = str.toCharArray();
	for(int i=array.length-1;i>=0;i--) {
		reverse +=array[i];
	}

	if(str.equals(reverse))
		return true;
	else
		return false;
	
}
}
