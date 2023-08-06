package com.yodlee.Test2;

import java.util.Date;

public class ConvertStringToDate {
public static void main(String[] args) {
	String date = "31-Jan-1990";
	Date converted = new Date(date);
	System.out.println(converted);
}
}
