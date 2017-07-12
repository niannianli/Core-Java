package com.java.abstraction;

public class AbstrationDemo {

	public static void main(String[] args){
		
		// abstraction
		// you know what to do? 
		// you do not know how to do?
		
		// abstract: hiding the implementation
		
		// no object from abstract class
	//	AbstractDemo ad = new AbstractDemo();
		
		// you can only create object with sub class
		// but the class type can be sub or super
		// either way: the object will call methods in sub
		// as overriding
		
	//	AbstractDemoImpl adi = new AbstractDemoImpl();
		
		// widely used: user access abstract,
		// server create object
		
	//	AbstractDemo ad = new AbstractDemoImpl();
	//	AbstractDemo ad = new AbstractDemoImpl(20);
	
		//	adi.add(3, 4);
	//	ad.sub(4, 3);
	
		Math m = new AbstractDemoImpl(20);
		System.out.println(m.i);
		
		m.add(2,  4);
	
	}
	
}

abstract class AbstractDemo{
	
	//always called by sub
	public AbstractDemo(){
		System.out.println("Abstract Constructor");
	}
	
	// this is not called, becasue sub has no same constructor
	// so how can this be called?
	// use super(i);
	public AbstractDemo(int i){
		
		System.out.println("Abstract i Constructor");
	
	}
	
	// hide method code from user
	// you know you need this method, 
	// but you do not know how to implement it yet
	public abstract void add(int a, int b);
	//	System.out.println(a+b);
	
	public abstract void sub(int a, int b);
	
	// non abstract can also be defined here
	public void mul(int a, int b){
		System.out.println(a*b);
	}

}

class AbstractDemoImpl /**extends AbstractDemo*/ implements Math{
	
	public AbstractDemoImpl(){
		//if not defined, call super first constructor
		// now call second constructor only, not first one
		// if no super, it will call the first default type constructor
//		super(20);
		System.out.println("Abstract Sub Constructor");
	}
	
	public AbstractDemoImpl(int i){
		// now call second constructor only, not first one
		// if no super, it will call the first default type constructor
		//super(20);
		// no super, it will call default super constructor
		// using super, it will call second super constructor
	//	super(10);
		System.out.println("Abstract Sub i Constructor");
	}
	
	// better put it here as ovrride
	@Override
	public void add(int a, int b) {
		// add your implementation here
		// without change original design		
		System.out.println(a+b);
	}

//	@Override
	public void sub(int a, int b) {
		
		System.out.println(a-b);
		
	}	
	
	public void delete(){
		
	}
	
}

// client: access stub only: abstract class: no object created
// now client call server, call method
// server: knows the implementation, object created, 
//and now use method

// you have access to abstract, 
//not implementation(inside server only)

// constructor in abstract class: 
// you can define constructor
// but how to call it?
// as no object will be created from abstract class?

// whenever you create a sub object, use parent(abstract) reference,
//why both parent and sub constructors are called?
// whenever a sub object is created, it will call all constructors from parents,
// then its own constructor

// if no constructor, JVM uses default constructor
// if abstract class, JVM does not create default one

// interface: helps java to implement multiple classes
// but it is not multiple inheritance
// some methods can be defined earlier in our project
// implementation can be defined later only

// no need keyword: abstract: by default, everything is abstract in Interface
interface Math{
	
   // by default: public static final: could not be changed
	int i = 90;
	
	// by default: public abstract
	
	// must be implemented
	void add(int a, int b);
	
	void sub(int a, int b);
	
}

// interface used more than abstract:

// private, default, protected, public
// in case of overriding:
// parent:public
// child:public only, no weaker; child must be stronger

//parent: private: weaker
// child: public, protected, default: stronger or same

// interface: public abstract
// child: must be public only, no other choice

// use CONSTANT variable, abstract methods in interface

//Exception:
