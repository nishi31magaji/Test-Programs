package com.yodlee.Test2;

import java.util.Arrays;

public class CheckAnagram {
	
	public static void isAnagram(String str1,String str2) {
        boolean status = true;  
        String str3 = str1.replaceAll("\\s", "");
        String str4 = str2.replaceAll("\\s", "");
		if(str3.length()!=str4.length()) {
			status= false;
		}
		
		else {
			char strArray1[] = str3.toLowerCase().toCharArray();
			char strArray2[]=str4.toLowerCase().toCharArray();
			Arrays.sort(strArray1);
			Arrays.sort(strArray2);
			status = Arrays.equals(strArray1, strArray2);
		}
		
		if(status) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}
	 public static void main(String[] args) {  
	      isAnagram("Keep", "Peek");   
	      isAnagram("Mother In Law", "Hitler Woman");  
	    }  
}
