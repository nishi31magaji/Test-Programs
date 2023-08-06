package com.yodlee.test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class TestDate {
	static String fromDateStr=null;
	public static void main(String[] args) {
		Date fromDate = new Date(1654712999999L);//epoch time for 9th June
		 fromDateStr= getStringFromDate(fromDate);
		System.out.println("String to date:"+fromDateStr);
		fromDate=getDateFromString(fromDateStr);
	
		
	}
	 public static Date getDateFromString(String strDate) {
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        SimpleDateFormat finalFormatter = new SimpleDateFormat("dd/MM/yyyy");	        

	        //formatter.setTimeZone(TimeZone.getTimeZone("PST"));
	        Date finalDate = null;
	        try {
	        	finalDate = formatter.parse(strDate);	        	
	        	System.out.println("FinalDate:"+finalDate);
	        } catch(Exception e) {
	        	e.printStackTrace();
	        }
	        return finalDate;
		}
	//PDT 2022 IST 2022 as per system calander
	
	 public static String getStringFromDate(Date date) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			sdf.setTimeZone(TimeZone.getTimeZone("PST"));
			return sdf.format(date);
		}
	
}
