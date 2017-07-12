package com.java.polymorphism;

public class Overloading {

	// same name, different parameters
	// only the matched parameters method is invoked
	// this is polymorphism
	void add(Integer a1, Integer a2) {
		System.out.println(a1 + a2);
	}
	
	void add(Integer a1, Integer a2, Integer a3){
		System.out.println(a1 + a2 + a3);
	}
	
	void add(Double a1, Double a2) {
		System.out.println(a1 + a2);
	}
	
	// when to use int, when to use Integer: always use Integer
	// the wrap class
	
	// overriding, happens between sub and super classes
}
