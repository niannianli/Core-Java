package com.java.basics;

public class ConstructorDemo {

	// loaded before running main method:
	// before object
	// before constructor
	// static field can be used anywhere with classname only
	static {
		// java code all static here: all loaded before execution
		System.out.println("Static Block");
	}

	// to call this method, we have to create an object, then call the method
	int add(int i, int j) {
		return i + j;
	}

	// avoid creating too many objects
	// instead use static, so the method can be used everywhere
	// thousands of users use the same method without creating thousands of
	// objects
	static int add1(int i, int j) {
		return i + j;
	}

	// String: non-primitive; not primitive data type;
	// void : no need to return;
	// skillgraph

	public static void main(String[] args) {

		// build a car
		// 1, build doors
		// 2, build a ...

		// 4 objects: 4 times constructor is called
		Door door1 = new Door();
		Door door2 = new Door(45, 56);
		Door door3 = new Door("Green", 50, 80);
		// Door door4 = new Door();

		door1.method();
		System.out.println(door1.color);
		// System.out.println(door1.method1(23, 34));
		System.out.println(door1.width);
		System.out.println(door1.height);

		System.out.println(door2.color);
		System.out.println(door2.width);
		System.out.println(door2.height);

		System.out.println(door3.color);
		System.out.println(door3.width);
		System.out.println(door3.height);

		door1.calculateArea();
		door2.calculateArea();
		door3.calculateArea();
		
		// every object contains the variables/constructor/method

		// but only variables are properties, which can be different
		// for each object

		// while constructor/method are shared the same

		System.out.println(Door.projectName);
		Door.display();

		Door d = new Door();
		System.out.println(d.projectName);

		int[] arr = { 12, 58, 780 };
		// int i = arr[0];

		for (int ii = 0; ii < arr.length; ii++) {
			System.out.println(arr[ii]);
		}

		for (int iii : arr) {
			System.out.println(iii);
		}

	}

}

class Bngine {

	int abc = 20;
}

class Door {

	// variables: properties: explicitly called/used
	// String color = "RED";
	// int width = 80;
	// int height = 60;

	String color; // instance variable, member variable
	int width; // works with objects
	int height;

	// static will be loaded with class without creating objects
	// non-static will be loaded only when objects created

	// static variable/class vaiable
	// means with class not with a certain object
	static String projectName = "CAR"; // you can change it

	final static int PROJECTID = 1;// cannot be changed

	// if no constructor defined, java will define the default for you
	// if defined one, no defautl will be there, must use your own
	// if you still want to use the default one, you have to write
	// by yourself

	// this constructor is called when you create an object
	Door() {
		// initialzie variables in Constructor
		color = "RED";
		width = 34;
		height = 79;
		System.out.println("Constructor1");
	}

	Door(int i1, int i2) {
		width = i1;
		height = i2;
		System.out.println("Constructor2");
	}

	Door(String c, int w, int h) {
		color = c;
		width = w;
		height = h;
		System.out.println("Constructor3");
	}

	// explicitly called
	void method() { // member method
		System.out.println("Method");
	}

	int method1(int i1, int i2) {
		return i1 + i2;
		// System.out.println(i1 + i2);
	}
	// multiple methods: contain paramers maybe

	void calculateArea() {
		System.out.println(width * height);
	}

	// same here: with class, not with a certain object
	static void display() {
		System.out.println(projectName);
	}

	// satic block
	static {
		// java code all static here: all loaded before execution
		// not loaded if the class is not used
		// if you are using this class
		// then jvm loads static block
		System.out.println("Static Block 1");
	}

}

class Glass {

}

// jvm loads
// before executed:
// static are loaded
// cannot make a statci reference to non-static field
// for, if, array,
