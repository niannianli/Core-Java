package com.java.assignsnew;

import java.util.Calendar;

public class DayDiff {

	public static void main(String[] args) {

		// get day difference between 2 days, using Calendar
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		// set the dates
		cal1.set(2017, 05, 31);
		cal2.set(2017, 07, 15);

		// convert the dates to milliseconds
		long milis1 = cal1.getTimeInMillis();
		long milis2 = cal2.getTimeInMillis();

		// get the diff
		long diffMS = milis2 - milis1;

		// convert the difference from milliseconds to days
		// ms, s, m, h
		long diffDays = diffMS / (24 * 60 * 60 * 1000);

		System.out.println("Day difference of the 2 dates is " + diffDays + " days.");
	}
}
