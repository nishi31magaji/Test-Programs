package com.yodlee.Test2;

public class FirstUpperCase {
	public static void main(String[] args) {
		String words = "this is javatpoint";
		String splitWords[] = words.split("\\s");
		for (String word : splitWords) {
			String first = word.substring(0, 1).toUpperCase();
			String remainingString = word.substring(1);
			String finalString = first.concat(remainingString);
			System.out.print(finalString);
			System.out.print(" ");

		}
	}
}
