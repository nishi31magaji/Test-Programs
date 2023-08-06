package com.yodlee.test;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class Converter2 {

	/**
	 * Utility function to convert java Date to TimeZone format
	 * @param date
	 * @param format
	 * @param timeZone
	 * @return
	 */
	public static String formatDateToString(Date date, String format,
			String timeZone) {
		// null check
		if (date == null) return null;
		// create SimpleDateFormat object with input format
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		// default system timezone if passed null or empty
		if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
			timeZone = Calendar.getInstance().getTimeZone().getID();
		}
		// set timezone to SimpleDateFormat
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		// return Date in required format with timezone as String
		return sdf.format(date);
	}

	public static void main(String[] args) throws ParseException {
		//Test formatDateToString method
		Date date = new Date();
		System.out.println("Default Date:"+date.toString());
		String pst_date=formatDateToString(date, "dd/MM/yyyy hh:mm:ss", "PST");

		//String pst_date=formatDateToString(date, "dd MMM yyyy hh:mm:ss a", "Pacific/Enderbury");
		System.out.println("System Date in PST: "+pst_date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
		//	Date fromDateConverted= new Date(pst_date);
	//	System.out.println("String to java.util.date: "+fromDateConverted);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date fromDateConverted2 = formatter2.parse(pst_date);
		System.out.println(fromDateConverted2);
	}

}

