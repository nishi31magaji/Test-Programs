package com.yodlee.test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Converter3 {
public static void main(String[] args) {
	Date fromDate=null;
	Instant instant = Instant.ofEpochSecond(1654626599999L);
    ZonedDateTime zdt = instant.atZone(ZoneId.of("America/Los_Angeles"));
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm:ss", Locale.ENGLISH);
    fromDate = new Date(dtf.format(zdt));
    System.out.println(fromDate);

}
}
