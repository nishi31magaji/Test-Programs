package com.yodlee.Test2;

public class CountWords {
public static void main(String[] args) {
	String str = "    India Is My Country";
	String trimStr = str.trim();
	String strArray[]= trimStr.split("\\s");
	int count =0;
	for(String word : strArray) {
		count=count +1;
	}
	System.out.println(count);
}
}
