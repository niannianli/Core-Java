package com.java.basics;

public class Clazz {

	static int var = 20;
	
	static class Inner{
		
		public void callMe(){
			System.out.println("Call me");
		}
	}
	
}

// no private/protected class : could not be used if so, no point
// public, default