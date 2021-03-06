package com.java.basics;

import java.util.Comparator;

public class Main3 {

	public static void main(String[] args) {
		
		// System.out.println(x);
		User user = new User();

		// user is only User type
		user.callSuper();
		// user.callSub();

		// emp is both Emp and User type
		// will constructor both User/Emp
		Emp emp = new Emp();
		emp.callSuper();
		emp.callSub();

		User useremp = new Emp();
		useremp.callSuper();
		// because it is User type now.
		// useremp.callSub(); not working
		//but if we can same method in super and sub, then sub can be accessed: override

		Manager manager1 = new Manager();
		// Object already extended, so can access
		// everything in Object class.
		// Object is the superclass of all classes
		// no need to import Object, as it is default
		// java.lang.*
		// not neccessary: java.lang.Object
		// System.out.println(manager.hashCode());

		// Manager manager2 = new Manager();

		// this time, both pointing to the same object, same memory space
		Manager manager2 = manager1;

		int x = 20;
		int y = 30;
	
		// why same here: overriding/overloading
		int y1 = 20;

		// value is different, double equal
		System.out.println(x == y);

		// how to compare 2 objects: false: different objects
		// double equal: check memory
		// 2 spaces are created
		System.out.println(manager1 == manager2);

		// equals(): is always use == by default;

		// JVM creates a unique number, hashCode for every object.
		System.out.println(manager1.hashCode());
		System.out.println(manager2.hashCode());

		// different numbers, but related, number is generated by hashCode()
		System.out.println(Integer.toHexString(manager1.hashCode()));

		// ClassName@number
		// toString() is not required, called by default
		System.out.println(manager1);

		// skillgraph: core java, advanced,
		// database, jdbc
		// servlets

		// Emp emp = new Emp();

		User usercon = new User("str");
		User usercon2 = new User("str", "str2");

		// it means it will only inherate
		// the first constructor in SuperClass
		new Emp();

		// it will inherate first constructor in SuperClass
		// then it will override the second constructor in SuperClass
		// and generate subclass constructor only

		// if you want to invoke second constrcutor,
		// use super()
		// so the second in super class is invoked
		// not the deault first in super class
		new Emp("str");

		// Date
		// int daydiff(int day1, int m1, int y1, int d2, int m2, int y2)
		// return the day difference
		// 23 November 1918
		// 13 January 2016
		// no use of predefined method

		// Date new Date();
		// calendar new Calendar();

		class MyComparator implements Comparator<Integer> {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		}

		// TreeSet
		// Comparable
	}
}
