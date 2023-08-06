package com.yodlee.test;

import java.util.Calendar;
import java.util.Date;

public class TestClass {
public static void main(String args[]) {
	Calendar c = Calendar.getInstance();
	c.setTime(new Date());
	System.out.println(c.getTime());
	System.out.println("---------------------");
	c.add(Calendar.DATE, 1);
	System.out.println(c.getTime());
	System.out.println("---------------------");
	//System.out.println(getStartOfDay(c.getTime()));
	Date toDate = new Date(1654757999999L);
	System.out.println("@toDate:"+toDate);
	System.out.println(getStartOfDay(c.getTime()).before(toDate));

	// to get it as false this c.getTime() should be earlier than new Date.

}

public static Date getStartOfDay(Date date) {
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	int day = calendar.get(Calendar.DATE);
	calendar.setTimeInMillis(0);
	calendar.set(year, month, day, 0, 0, 0);
	//System.out.println("getstartof day");
	//System.out.println(calendar.getTime());
	return calendar.getTime();
}

}
