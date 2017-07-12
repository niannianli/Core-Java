package com.java.accessin;

public class MathExtd extends Math {

	public static void main(String[] args) {
		
		MathExtd math = new MathExtd();

		math.doWork(math);

		// all from subclass
		// from subclass, not super class
		// math.add(50, 70);
		// math.add(23f, 45.45f);
		// math.add(34.45, 45.54);
		// math.add("Hello", "Wrold");
		// math.add(true, false);

		// all from super class
		Math math1 = new Math();
		math1.doWork(math1);
		// from super class only
		// math1.add(50, 70);
		// math1.add(23.767f, 45.45f);
		// math1.add(34.45, 45.54);
		// math1.add("Hello", "Wrold");
		// math1.add(true, false);

		// variables from super only, but method overriding happens, so
		// method from sub class sometimes
		Math math2 = new MathExtd(); 
		// dynamic method dispatcher
		// sub object, but super type

		// it calls sub method overriding super method becasue it is sub object
		// it related to super variables, becasue it is super type

		// good thing: no type change, only change the object your created
		// no change of parent too,
		// only change in sub class with new code
		// math2.add(50, 70);

		math2.doWork(math2);
	}

	public void add(float f1, float f2) {
		System.out.println(f1 + f2);
	}

	public void add(char a, char b) {
		System.out.println(a + b);
	}

	public void add(Boolean b1, Boolean b2) {
		System.out.println(b1 && b2);
	}

	// overriding, if this is not here, sub call super
	// if this is here, sub call sub only
	// overriding happens
	public static void add(int a, int b) {
		System.out.println("from sub class:" + a + b);
	}

}


// if there is some changes in requirements, no good to change original code
// instead, create a sub class, add new code
// use orignial class type, but create sub object to use new code

// do not have to decide the type,
// just decide the object and use your object

// type defined earlier, maybe outside somewhere, could not be changed
// in this case, you just pass your object

// Spring:
// we do not create new object, object created by Spring
// we just pass the object to the type already defined outside our code

// interface: abstraction
