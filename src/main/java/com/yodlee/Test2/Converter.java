package com.yodlee.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Converter {
public static void main(String[] args) {
	Date date = new Date(1654772399999L);
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
    String formatted = format.format(date);
    System.out.println(formatted);
    format.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
    formatted = format.format(date);
    System.out.println(formatted);
}
}
