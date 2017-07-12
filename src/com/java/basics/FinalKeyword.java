package com.java.basics;

public class FinalKeyword {
	
	// can be changed in Constructor, thats all
	final Integer var;
	
	FinalKeyword(){
		var = 20;
	}
	
	// final method: cannot be overridden, 
	final void callMe(){
		
	}
	
	// final class: will not participate in inheritance
}
