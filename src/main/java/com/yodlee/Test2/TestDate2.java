package com.yodlee.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class TestDate2 {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	//In Default Timezone
	Date currentDate = new Date();

	//Date in current timezone
	System.out.println(FORMATTER.format(currentDate));

	//In PST Timezone
	TimeZone pstTimeZone = TimeZone.getTimeZone("PST");
	FORMATTER.setTimeZone(pstTimeZone);
	String sDateInPST = FORMATTER.format(currentDate);
	System.out.println(sDateInPST);
	
	SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	formatter2.setTimeZone(pstTimeZone);
	Date fromDateConverted2 = formatter2.parse(sDateInPST);
	System.out.println(fromDateConverted2);
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ssa z");
//	ZonedDateTime zonedDateTime = ZonedDateTime.parse(sDateInUTC, formatter);
	
//	System.out.println(zonedDateTime);
}
}
