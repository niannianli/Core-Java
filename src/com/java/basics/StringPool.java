package com.java.basics;

public class StringPool {

	public static void main(String[] args){
		
		// String		
		String s = "hello";
		String ss = "hello";
		
		// not necessary to use new keyword
		// jvm does for you
		
		// but if you use new keyword, it means a new object 
		// is created
		String s1 = new String("hello");
		
		// 2 different objects
	//	System.out.println(s == s1);
		
		// same objects, because you are not using new keyword,
		// no new object
		// jvm checks string pool, saw the same object,
		// so use the same object,
		// jvm does not create a new object
		// instead use the same one in the string pool
	//	System.out.println(s == ss);
		
		// == : check memory/object
		// equals: check content, not object
		
	//	System.out.println(s);
	//	System.out.println(ss);
	//	System.out.println(s1);
		
		System.out.println(s.equals(ss));
		System.out.println(s.equals(s1));		
	}
	
}
