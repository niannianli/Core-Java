package com.java.basics;

public class NonprimitiveData {

	public static void main(String[] args) {

		byte b = 10; // 8 bits
		Byte by = 10;

		short s = 20; // 16
		Short sh = 23;

		int i = 30; // 32 default
		Integer ii = 34;

		float f;

		// b = i; // 32 to 16, no no no
		// i = l;// 64 to 32, no no no

		// f = 54.666; // double to float no no no

		// only smaller to larger works

		f = (float) 345.55; // explicit type case

		// 32 to 64 works
		double d = f; // implicit typecast

		long l = 40l;// 64
		Long llll = 44L;// add L please

		// float f = 23.45f;// 32
		Float fff = 34.56F; // add F please

		// double d = 45.44;// 64 default
		Double ddddd = 44.44;

		char c = 'r';// 16

		boolean bb = false; // 1bit
		boolean bbb = true;// 1 bit

		Object o = 23;
		Object ol = 444444440;
		Object o1 = 23.6;

		// System.out.println(o instanceof Integer);
		// System.out.println(ol instanceof Long);
		// System.out.println(o1 instanceof Double);
		// System.out.println("hello world");

		// Object is super class of everything: everything is Object type.

		// double could not be convereted to byte: larger to smaller : no no no
		// smaller to larger: yes yes yes

		Object oo = (22 + 44.55);

		// false, becasue default is Double:
		// oyu have to add 334.44f to be Float tyep
		System.out.println(oo instanceof Float);

		// primitive is not class type, only data type
		// non-primitive type is class type

		// create object : an instance/implementation of a class

		A a1 = new A();
		A a2 = new A();
		A a3 = new A(); 
		// object and value and non-primitive data type
		// a3 :reference/variable
		// run the application: whenever creates an object,
		// a memory space is created in ram

		int iiiiiii = 56;// data type
		Integer ii33 = 45; // ii33 is a variable: non-primitive, class type
		Integer ii44 = new Integer(45); 
		// java automatically does this, no need to new

	}

	// Java search for public static void main method only and run it
	// not other methods unless explicitly called.
	void main() {
		// not executed unless called.
	}
}

// primitive:
// byte: 8
// short: 16
// int: 32
// long: 64
// float: 32
// double: 64
// char: 16
// boolean: 1

// non-primitive:
// Byte
// Integer

// a class is a design
class A {

	int i = 45;

	A() {

	}

	void method() {

	}
	// variable
	// constructor
	// methods
}


// Java already defined Integer, Double everything, just use them.

// if i run an application, a process is created inside memeory
// many processes with unique number are in memory now.
// inside process: objects created

// eclipse does not keep class files
// J2EE:
// how to use variable? call constructor/method in class?

// type casting: smaller to larger
// larger to smaller no

// bits means memory space
// 0 or 1: for 32 cells
class B {
	
	void method1() {
		
		int ii = 40; // 32
		long lllll = 56l; // 64

		// explicit cast:
		lllll = (long) 40;
		
		// implicit cast:
		lllll = ii; // assign i to l, menas convert int to long
		// both small to large

		// ii = lllll; //not possible

		// but if we are sure l is an int, we can use explicit cast
		ii = (int) lllll;
	}
}

// Object type casting?
// use collection framework can only use Integer
// Object oriented programming: not use of non-primitive data
// types
// supports only primitive data types only

// 2
