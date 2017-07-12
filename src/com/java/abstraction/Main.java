package com.java.abstraction;

public class Main {

	public static void main(String[] args) {

		// will call the implemented method
		// overriding, retrieves to Object
		// just change the object
		AbstLogin login = new Login();
		AbstLogin login2 = new LoginV2();

		InterDemo interDemo = new Child();
		interDemo.callMe();

		// final value could not be changed.
		// InterDemo.VAR = 30;

		// constant: capital/uppercase
		// USER_DETAIL: naming convention

	}
}
