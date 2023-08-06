package com.yodlee.Test2;

public class ReverseStringDemo {
public static void main(String[] args) {
	String str = "He?llO$";
	if(str==null) {
		throw new IllegalArgumentException();
	}
	String strReverse="";
	StringBuilder strBuilder = new StringBuilder();
	char[] strArray = str.toCharArray();
	
	for(int i=strArray.length-1;i>=0;i--){
		strReverse +=strArray[i];		
	}
	String newString="";
	for(char c:strArray) {
		/*
		 * if(c>=65 && c<=90) { newString += Character.toLowerCase(c); } else {
		 * newString += Character.toUpperCase(c); }
		 */
		
		newString += (c>=65 && c<=90)?Character.toLowerCase(c):Character.toUpperCase(c);
	}
	System.out.println("updated String:"+newString);
	//System.out.println(strBuilder);
}
}
