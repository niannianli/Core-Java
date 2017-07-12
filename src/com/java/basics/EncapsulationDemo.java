package com.java.basics;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Employee employee = new Employee();
		
		// public
		employee.calculateSalary();

		// private: no: encalsulation: hiding the important property
		// System.out.println(employee.empId);

		// banking project: maintain accounts
		// without knowingn user requirements

	}

	// abstraction
	// encapsulation
	// polymorphism
	// inheritance
}


class Employee {

	// salary very important to employee
	// hide these variables: private: encapusulation
	// only access inside class
	// encapsultaion only works for variables
	// not work for methods
	private int empId;
	private String name;
	private String address;
	private String phoneNo;
	private int workingDayInMonth;
	private double salary;

	// if make constructor private, it means you do not need
	// an object get created outside
	// object can be created inside class
	// private Employee(){

	// }

	// but how to calculate salary, not important to employee
	// share the method: public
	public void calculateSalary() {

	}

	// how the leave is applied not important to employee
	public void leaveApplied() {

	}

	// method can be private, but not accessible to
	// outside, no point.

	// public: anywhere

}

// class can not be declared private
// one public class only in one java file
// other class can not be declared as public
// access: public private default protected

class SavingAccount {

	public SavingAccount() {

	}

	// call this method to register account
	// if you are a customer, you do not need to know
	// how the account is registered
	// you only need to know you can use the method
	// registerAccount()
	// bank hides this method from user:
	// abstraction
	public void registerAccount() {
		// how to register account?
	}

	// abstraction: hiding the implementation

}

// abstract: class or method

// polymorphism:
// your phone: calls, texts, apps, games, music, videos
// one use interface: multiple implementations:

// inheritance:
// waterfall: 
//feasibility;
// analysis&design; (abstraction&encapsulation)
// coding;
// (unit) testing
// implementation/production/maintenance

// already have working code, no touch of these
// existing code
// just use inheritance and make minor changes

// human: inheritance
// men
// women

// agile:

// packages:

// load static first: means
// loading class to JVM only
// objects created then to RAM: memory
