package com.yodlee.Test2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharactersInString {
public static void main(String[] args) {
	String str = "hellonishihowareyou";
	Set<Character>hm = new HashSet<Character>();
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(!hm.add(ch)) {
			System.out.println(ch);
		}
	}
	
}
}
