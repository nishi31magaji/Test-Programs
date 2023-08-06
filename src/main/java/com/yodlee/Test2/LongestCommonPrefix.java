package com.yodlee.test;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix l = new LongestCommonPrefix();
		String strs[] = { "flower", "flow" };
		l.longestCommonPrefix(strs);
	}

	public String longestCommonPrefix(String[] strs) {
		int size = strs.length;
		 
        /* if size is 0, return empty string */
        if (size == 0)
            return "";
 
        if (size == 1)
            return strs[0];
 
        /* sort the array of strings */
        Arrays.sort(strs);
 
        /* find the minimum length from first and last string */
        int end = Math.min(strs[0].length(), strs[size-1].length());
 
        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size-1].charAt(i) )
            i++;
 
        String pre = strs[0].substring(0, i);
        System.out.println(pre);
        return pre;
		
	}
}
