package com.java.abstraction;

public abstract class AbstLogin {
		
	//abstract can only be in abstract class
	public abstract Boolean validateUser (String username, String password);
	
	public abstract void call();
	
	//default
	void callMe(){
		System.out.println("Call Me");
	}
	
}
