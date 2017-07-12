package com.java.basics;

public class Main72 {
	
	public static void main(String[] args){
		
		Clazz7 clazz = new Clazz7();
		clazz.var = 30;
		Clazz7.var = 30;
		
		Clazz7.Inner inner = new Clazz7.Inner();
		
		inner.callMe();
	}
	
}
