package com.yodlee.Test2;

public class RevertWordsOnly {
public static void main(String[] args) {
	String originalString = "I love java programming";
	String[] words = originalString.split(" ");
	String newString = "";
	for(String word:words) {
		newString = word + " "+ newString;
	}
	System.out.println(newString);
}
}
