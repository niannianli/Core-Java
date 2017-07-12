package com.java.basics;

public class Emp extends User {
	
	// if no construtor, JVM will generate default one, 
	// the one in super class
//	Emp(){		
//	}

	// if you create by yourself, 
	//JVM will not create default one for you
	Emp(){
		System.out.println("Emp Demo");		
	}
	
	Emp(String str){
		super("str");
		System.out.println("Emp Demo Str");		
	}
	
	void callSub(){
		System.out.println("Call Sub");
	}
	
}
