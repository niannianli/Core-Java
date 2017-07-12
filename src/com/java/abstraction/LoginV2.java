package com.java.abstraction;

public class LoginV2 extends AbstLogin{

	@Override
	public Boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub	
	}
	
	// default too
	 void callMe(){
		 
	 }
	 
	 // private/default/protected/public
	 // super always have stricter access
	 // for example:
	 // if super is public, sub must be public
	 // if super is default, sub must be default public
	 // if super is protected, sub must be 
	 // sub have looser access	 
}
