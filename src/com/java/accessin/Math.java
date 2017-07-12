package com.java.accessin;

public class Math {

	// could not be changed:
	// CONSTANCT:
	public static final String PROJECT_NAME = "NIAN";
	// EMP_ADDRESS;
	public static MySystem out;

	public static void main(String[] args) {
		Math math = new Math();
		math.add(50, 70);
		math.add(34.45, 45.54);
		math.add("Hello", "Wrold");
		math.add(23.767f, 45.45f);

		math.out.println();
	}

	public static void add(int a, int b) {
		System.out.println("from super class:" + a + b);
	}

	public void add(double d, double dd) {
		// Class.staticVariable.method();
		System.out.println(d + dd);
	}

	public void add(String s1, String s2) {

		// System: Class
		// Class calls out variable
		// out: variable of PrintStream type object
		// then out can call println method
		System.out.println(s1 + s2);
	}

	// super class only
	public void doWork(Math m) {
		m.add(50, 70);

	}

	// out is a static class object
	// thats why it can call the method

}


// already decides which method to call, clearly
// compile time polymorphism: method overloading:
// same method, differnt parameters, different places

// did not know which mehtod to call until running: get the inputs
// runtime polymorphism: method overririding
// same method, same parameters, totally cover, same place

// static method: overriding? no loaded before objects
// overriding depends on what kind of objects you are passing
// becaseu not changed after loaded,
// but overriding happens : needs changes
// always call partent, no matter super or sub object
// it got confused

// static method: overloading? this is already overloading
// created before objects

// naming convention
// Class.staticVariable.method()

// Class:
// methodName():
// methodMyName():
// constant:

class MySystem {
	// String out;

	public void println() {

	}
}