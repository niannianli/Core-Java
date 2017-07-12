package com.java.basics;

import java.io.Serializable;

public class User implements Serializable{
	
	//variable
	
	int var = 50; // instance variable or member variable
	int j = 100; // create an object, then use this
	
	// static: not related to an object, belongs to class
	static int stat = 500;
	
	static void staticMethod(){
		System.out.println("Static Method");
	}
	
	// constructor: executed when object created.	
	User(){
		System.out.println("User Demo");		
	}
	
	User(String var){
		System.out.println("User Cons");
	}
	
	User(String var, String var2){
		System.out.println("User Cons2");
	}

	// methods: member function: executed when invoked.
	void callMe(){
		System.out.println("Call Me");
	}
	
	//JVM: if a class is not used, 
	//it is loaded(including static)
	static{		
		System.out.println("User Static");
	}
	
	//String name;
	String addr;
	String phoneno;
	
	void callSuper(){
		System.out.println("Call Super");
	}
	
	@Override
	public boolean equals(Object object){
		return true;
	}
	
	String name; 
	
}

// collection, data structure