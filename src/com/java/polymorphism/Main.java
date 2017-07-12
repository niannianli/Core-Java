package com.java.polymorphism;

public class Main {
	public static void main(String[] args) {
		
		Overloading overloading = new Overloading();
		overloading.add(23,  34);
		overloading.add(23,  34, 45);
		overloading.add(23.4,  34.5);
		
		// it can only access Parent class
		Parent parent = new Parent();		
		parent.superMethod();
	//	parent.subMethod();
		
		// child can access both Child and Parent, becasue Child extends Parent
		Child child = new Child();
		child.subMethod();
		child.superMethod();
		
		// what if? then no, it is Parent type now, so you can only access Parent
		// check the Reference class, not Object
		Parent child1 = new Child();
	//	child1.subMethod();
		child1.superMethod();
		
		// what if we have a method both in super and sub class, which one should I use?
		// this is overriding
		// super always use super
		// sub always use sub
		parent.callMe();
		child.callMe();
		
		//what if Parent reference, Child class?
	    // super has no child method, so could not call it
		// but super has child method now, so it retrieves to the object
		child1.callMe();
		
		// abstraction
		
	}
}
