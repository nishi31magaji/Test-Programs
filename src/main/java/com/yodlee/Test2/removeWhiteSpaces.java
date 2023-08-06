package com.yodlee.Test2;

public class removeWhiteSpaces {
public static void main(String[] args) {
	StringBuilder output = new StringBuilder();
	String str = " Hello World ";
	String newStr = str.trim();
	String newStrStrip = str.
	System.out.println(newStr);
	char[]ch = str.toCharArray();
	for(char c : ch) {
		if(!Character.isWhitespace(c))
			output.append(c);
	}
	System.out.println(output);
	
}
}
