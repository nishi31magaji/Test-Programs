package com.yodlee.Test2;

public class RemoveWhiteSpaceFromString {
	public static void main(String[] args) {
		String str = "  hello world !! ";
		//System.out.println(str);
		//System.out.println(str.trim()); // for leading and trailing white spaces
		String noSpaceStr = str.replaceAll("\\s", "");
		System.out.println(noSpaceStr);

		char[] strArray = str.toCharArray();
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((!Character.isWhitespace(strArray[i])) && (strArray[i] != '\t')) {
				strBuffer.append(strArray[i]);
			}
		}
		System.out.println(strBuffer);

	}
}
