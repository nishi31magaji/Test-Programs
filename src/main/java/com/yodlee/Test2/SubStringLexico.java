package com.yodlee.Test2;

public class SubStringLexico {
	public static void main(String[] args) {
		SubStringLexico s = new SubStringLexico();
		System.out.println(s.getlargestSmallestString("welcometojava", 3));
	}

public String getlargestSmallestString(String s,int k) {
	String largest = "";
	String smallest = "";
	largest=smallest = s.substring(0,k);
	for(int i =1;i<s.length()-k+1;i++) {
		String substr = s.substring(i, i+k);
		 if (smallest.compareTo(substr) > 0)
	            smallest = substr;
	     if (largest.compareTo(substr) < 0)
	            largest = substr;
	}
	return smallest + "\n" + largest;
}
}
