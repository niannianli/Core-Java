package com.java.accessin;
// com is universal

//nian: this package is all about nian
// a com folder is created
// inside a nian folder is created

public class RuninDemoAgain {

	private int p = 100;// only within class
	int d = 200; // default: within package only

	// within package, outside package if inheritance
	protected int po = 300;

	public int pub = 400;// anywhere in project

	// not working for local variable
	// no need to define, as only accessible
	// within the method
	// no static either, no point
	// only works for method
	
	// can be public or static
	// local variable only depends on method
	// method can have anything, variable is related
	// it could not be used without method
	// no bother define local variable as
	// anything
	// method decides them

	public static void main(String[] args) {

		RuninDemoAgain nian = new RuninDemoAgain();

		System.out.println(nian.p);
		System.out.println(nian.d);
		System.out.println(nian.po);
		System.out.println(nian.pub);
	}

	public void display() {

	}

}

// after some time, you need to change something,
// are you going to change all your previous code?
// no, use inheritance only

// extends