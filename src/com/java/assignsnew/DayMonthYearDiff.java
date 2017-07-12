package com.java.assignsnew;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayMonthYearDiff {

	static int yearDiff(Date date1, Date date2) {

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		
		int yeard = year1 - year2;
		
		if (yeard >= 0)
			return yeard;
		else
			return yeard * (-1);
	}

	
	static int monthDiff(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		int yeard = year1 - year2;

		int month1 = cal1.get(Calendar.MONTH);
		int month2 = cal2.get(Calendar.MONTH);
		int monthd = month1 - month2;

		if (yeard >= 0) {
			if (monthd >= 0)
				return yeard * 12 + monthd;
			else
				return yeard * 12 - monthd;
		} else {
			if (monthd < 0)
				return yeard * (-1) * 12 + monthd * (-1);
			else
				return yeard * (-1) * 12 - monthd * (-1);
		}
	}

	
	static long dayDiff(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);

		// convert the dates to milliseconds
		long milis1 = cal1.getTimeInMillis();
		long milis2 = cal2.getTimeInMillis();

		// get the diff
		long diffMS = milis2 - milis1;

		// convert the difference from milliseconds to days
		// ms, s, m, h
		long diffDays = diffMS / (24 * 60 * 60 * 1000);

		return diffDays;

	}

	
	public static void main(String[] args) throws ParseException {
		Date date1 = new SimpleDateFormat("yyyyMMdd").parse("20100520");
		Date date2 = new SimpleDateFormat("yyyyMMdd").parse("20170618");

		System.out.println("day difference is: " + dayDiff(date1, date2) + " days.");
		System.out.println("month difference is: " + monthDiff(date1, date2) + " months.");
		System.out.println("year difference is: " + yearDiff(date1, date2) + " years.");
	}
}
