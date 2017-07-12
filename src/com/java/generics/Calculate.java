package com.java.generics;

public class Calculate<T extends Number> {

	//String var;
	// use Object type can be converted to other types
	//Object var;
	
	// use Generics
	T var;
	
	
	/**public void add(Integer a1, Integer a2){
		System.out.println(a1 + a2);
	}
	
	public void add(Double a1, Double a2) {
		System.out.println(a1 + a2);
	}
*/
	
	public void add(T a1, T a2) {
		
		// Number is super class of all Integer/Double/...
		// only Number
		Number number1 = (Number)a1;
		Number number2 = (Number)a2;
		
		System.out.println(number1.doubleValue() + number2.doubleValue());
		
		// how about String type?
		// String cannot be converted to Number: ClassCastException		
	}
	
}
