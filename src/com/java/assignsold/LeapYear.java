package com.java.assignsold;

import java.util.Calendar;
import java.util.Date;

public class LeapYear {

	public static void main(String[] args) {

		Date d = new Date();
		// day:
		// month: 0 - 11
		// year: 1900 + number: 1900 + 116 = 2016
		//better use Calendar
		Date dd = new Date(116, 0, 20);

		System.out.println("Date : Leap Year?");
		System.out.println(d + " : " + isLeapYear(d));
		System.out.println(dd + " : " + isLeapYear(dd));

	}

	// get year from Date, then decide whether it is leap year
	// no use of built in class
	public static boolean isLeapYear(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		// get year from Date
		int year = cal.get(Calendar.YEAR);

		// if year is divisible by 4, it is a leap year
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
		else
			return false;
	}

}