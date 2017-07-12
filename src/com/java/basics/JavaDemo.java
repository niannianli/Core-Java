package com.java.basics;

import java.util.Calendar;
import java.util.Date;

public class JavaDemo {

	// if here: JVM loaded it: because main is used,
	// within this class
	static {
		System.out.println("Java Demo static");
	}

	public static void main(String[] args) throws ClassNotFoundException {

		User user1 = new User();

		System.out.println(user1.var);

		user1.callMe();

		// everything inside the class are attached to the object
		User user2 = new User();

		user2.callMe();

		Window window1 = new Window();

		Window window2 = new Window();

		Window window3 = new Window();
		// process created after running app:

		// class: UserDetail; var/method: userDetail
		// CONSTANT: USER_DETAIL

		int var = 40;

		User.staticMethod();

		System.out.println(User.stat);

		// compile, loading class that is used: and static, execute

		// can i access static using Object: yes
		user1.staticMethod();

		// non-static: only work with Object, not class
		user1.var = 1000;
	
		// user1 will not affect user2
		System.out.println(user2.var);

		user1.stat = 1000;
	
		// static user1 will affect user2
		System.out.println(user2.stat);

		// no Object, but class is loaded.
		Class.forName("User");

		// String: no need using new keyword
		String str = "Hello";
		// immutable: Object can not be changed
		// so another object is created
		// str diconnects to original, and redirect to new
		// str = "Hello World";
		System.out.println(str.hashCode());

		// same: redirects to new obj
		// use hashCode to check
		// str = str + "World";
		System.out.println(str.hashCode());

		String str1 = str;
		System.out.println(str1.hashCode());

		str = str + "World";
		System.out.println(str.hashCode());

		// StringBuffer, StringBuilder changeable

		// check in spring pool,
		// get the same, so no new object created
		String str2 = "Hello";

		// not using new keyword, JVM see it already in pool
		// so no new object is created
		String str3 = "Hello";

		// a new object created, new memory space
		String str4 = new String("Hello");

		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		// memory space: true, same object
		System.out.println(str2 == str3);

		// different object: different memory space/address
		System.out.println(str3 == str4);

		// check value, equals always refer to ==
		// but why different here?
		// becasue String class overrides equals method
		// and changed equals details
		// check only value not the object
		System.out.println(str3.equals(str4));

		// User user1 = new User();
		// User user2 = new User();

		// false
		System.out.println(user1 == user2);

		// false
		System.out.println(user1.equals(user2));

		Date date = new Date();
		System.out.println(date);

		// class, static method, without creating object
		Calendar cal = Calendar.getInstance();
		
		// current date time
		Date date1 = cal.getTime();
		System.out.println(date1);

		cal.set(Calendar.YEAR, 1979);
	
		// month starts from 0: January
		// 1: February
		cal.set(Calendar.MONTH, 1);
	
		Date date2 = cal.getTime();
		System.out.println(date2);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		// google Calendar java class

	}

	// Encapsulation: hide data/info:private
	// abstraction: hide implementation: abstract class, interface
	// polymorphism: interfaces, extend, impl, override, overload
	// inheritance: super/sub classes

	// Data structures

	// javascript/jquery

	// Map<K, V> interface

	// HashMap
	// TreeMap

}