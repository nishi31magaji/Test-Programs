package com.yodlee.Test2;

public class RevertEachWord {
public static void main(String[] args) {
	String str = "this is javatpoint";
	String[]words = str.split(" ");
	String newString = "";
	String reversedString = "";
	for(String word:words) {
		String newWord = word;
		for(int i=newWord.length()-1;i>=0;i--) {
			newString = newString + newWord.charAt(i);

		}
	}
	System.out.print(newString);


}
}
