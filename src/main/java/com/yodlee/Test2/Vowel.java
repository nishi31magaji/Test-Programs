package com.yodlee.Test2;

public class Vowel {
	public static void main(String[] args) {
		Vowel v = new Vowel();
		System.out.println(v.isVowelPresent("helooo"));
		System.out.println(v.isVowelPresent("wrqty"));
		System.out.println(v.isVowelPresent("riya"));

	}

	public boolean isVowelPresent(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
}
