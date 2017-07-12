package com.java.exception;

public class ExceptionDemo {
	
	public static void main(String[] args) throws InterruptedException{
		
		int i = 10;
		int j =0;
		
		// before exception
	//	System.out.println("before exception");
		
	//	System.out.println(i/j);
		// program stops here.
		
		// not executed
	//	System.out.println("after exception");
		
		//ArithmeticException: runtime exception: unchecked
		// not required to handle
		
		// always clean projects
			
		System.out.println("thread start");
		
		// checked exception: must be handled
		// InterruptedException
	//	try {
		//	Thread.sleep(-1);
	//	sleep(3000);
			// this is not intterrupted exception
			// so was not catched
			// program stops suddenly
			
			// now catched the Exception
			// then program continues after error
			
			// error occured, but program continues
			// becasue checked exception
//	} catch (Exception e) {
			//e.printStackTrace();
		//	System.out.println("error");
	//	}
		
	//	divide(12, 0);// did not use throws or try catch
		// unchecked exception
		// not required to be handled
		// you can handle if you like
		// if handled: program will not be stopped
		
		//String s = "Hello";
		//String s = null;// non-primitive, no default value
		
	   // not forcing you to handle unchecked exception
		//System.out.println(s.length());
		
	//	int[] arr = {2, 3};
	//	System.out.println(arr[2]);
		
		// Object class is super class of everything		
		Object o = new AA();
		AA a = new AA();
		System.out.println(o);
		
		// why we can use hashCode() method:
		// which is not defined
		// becasue it is in Object class
		System.out.println(a.hashCode());
		
		// how could str converted to Object
		// String: special object: without using new to define
		String str = "Hello";
		
		// implicit cast: dynamic dispatcher
		Object os = str;
		
		// explicit cast
		String cast = (String)os;
		System.out.println(cast);
		
		//convert string to integer
//Integer castI = (Integer)os;
			
		BB bb = new BB();	
		// bb extends AA, so bb can be converted to AA
		AA aa = bb;
		
	//	String ss = "7";
		String ss = "rrr";
		
		// could not, convert string to interger like this
	//	Integer i = ss;
		
		//  instead do this
		Integer ii = Integer.parseInt(ss);
		System.out.println(ii);
		
		System.out.println("thread end");
		
		// for unchecked exception, progrom stops if error		
		// 5, unchecked exception:
		// 5.1, ArithemeticException: divide by 0
		// 5.2, NullPointer exception: null
		// 5.3, ArrayIndexOutOfBoundsException:
		// 5.4, ClassCastException:
		// 5.5, IllegalArgumentException: 
		// NumberFormatException
		
	}
	
	
	public static void divide(int a, int b){
		System.out.println(a/b);
	}
		
	public static void sleep(int time) throws InterruptedException{
	//	Thread.sleep(time);				
	}

	// throws has to be added everywhere:
	// if you do not know how to handle the exception
	// it means you are handleing the exception, but not where exception it is
	// just a random adding
	//better with try catch means you know where exception might occur

	// throws always with method	
}

// we did not define A extends Object
// implicit JVM did this for you already
class AA{
	
}

class BB extends AA{
	
}

// how jvm created object and throw it
// exception object

// Exception

// if exception occurred, jvm created an object
// then jvm threw the object(exception class object)

//1, Checked Exception:
// must be handled
//otherwise, 
// handled by the program
// program will not stop
// use of API
// due to serious problem

//2, Unchecked Exception:
// not handled in program
// developer not handled 
// JVM handle the exception
// program stops
// developer made the error:
// logic problem

//all exceptions happen at runtime
// unwanted situation

// Exception: Object

// JVM created this object and threw the object

// database:
// connection error: 
//not caused by developer

// Throwable Class: super class

//1, Exception Class:
// can try catch finally/throw

// 1.1 SQL Exception:...
// 1.2 AopException:...
// 1.3 RuntimeException:...
//1.3.1NullpointerException...
// 1.3.2 ArithmeticException...
//1.3.3 
// all checked exception extends Exception: must be handled
// unchecked exception extends RuntimeException: runtime exception only

//2, Error Class: cannot be handled
// too serious

