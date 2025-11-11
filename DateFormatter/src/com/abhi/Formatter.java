package com.abhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter {
	
	public static void main(String[] args) {
		
		String str = "2025-03-15";
		try {
			Date currDate = getCurrDate(str);
			System.out.println(currDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Date getCurrDate(String inDate) throws ParseException {
	    String defaultFormat = "yyyy-MM-dd";
	    SimpleDateFormat formatter = new SimpleDateFormat(defaultFormat);
	    return formatter.parse(inDate);
	}

}
