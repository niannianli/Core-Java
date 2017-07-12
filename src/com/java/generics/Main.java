package com.java.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
	/**	Calculate cal = new Calculate();
		cal.add(1,  2);
		cal.add(1.2, 3.4);
		cal.add("3.4", "7.8");
*/
		
		Calculate<Integer> cal = new Calculate<Integer>();
	//	cal.add(1, 2);
		
		// if T extends Number, String error here
	//	Calculate<String> cal1 = new Calculate<String>();
		
		// no problem, here, 
		//but in Calculate class String could not be casted Number
	//	cal1.add("3.4", "7.8");
	
		// now ClassCastException will not happen
	//	cal.add(1,  "45");
		
		// data structure: store/retrieve data
		// not using array
		
		int[] arr = {1, 2, 3};
		
		// allocates memory space 25 small cells
		int[] arr1 = new int[25];
		
		arr1[0] = 12;
		arr1[1] = 23;
			
		// why not using array?
		// have to defien the size first, but mostly we do not know
		// how much data we have
		// if we do not knwo how much space we need
		// then no array
		
		// memeory: ram
		
		// data structure do not create 
		// unnecessary space
		
		// Collection Frameworks in java
		// API: 
		//application programming interface
		
		// Collection
		
		//Interface Collection<E>
		// List:  ArrayList LinkedList
		// Set: HashSet TreeSet
		
		// Collection: Interface
		// Subclass: List, Set...
		Collection<Integer> collection = 
				new ArrayList<Integer>();
		
		// you can use
		List<Integer> list = new ArrayList<Integer>();
		// only you add value, will memory be created	
		collection.add(24);
		collection.add(24);
		collection.add(56);
		
		list.add(34);
		
		//collection.clear();
		//collection.remove();
		
		System.out.println("size: " + collection.size());
		
		Iterator<Integer> iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer var : collection) {
			System.out.println(var);
		}
		
		for(Integer var : list) {
			System.out.println(var);
		}

		
		// initially: 
		// ArrayList :int arr[] = new int[5];
		// arr[0] = 12;
		// arr[1] = 45;
		 // arr[2] = ...
		// if more than 5:
		// int arr[] = new int[10];
		// old values will be copied to new array
		// new values will be inserted starting from arr[5]
		
		List<Integer> list1 = new LinkedList<Integer>();
		
		// add one by one, create space by space
		// add a link to previous data after adding the new data
		
		// LinkedList is better: do not increase size/copy values 
		// like ArrayList
		
	//	LinkedList: 
		// insert: cut link, then link the new data to previous
		// and next data
		
		// delete: delete previous/next links, add a new link
		// to previous and next
		
		// search: very slow: 
		// especially if the data is the last element
		// start from the first element, then second, 
		// then...
		
		// if we have billions, takes time
		
		// how about arraylist?
		// search very fast, using index
		// add/delete very slow: move all elements after change
		
		// same order as added...
		
		// Set: 
		// HashSet:
		// TreeSet:
		
		//List allows duplicates
		// Set no duplicates
		
		System.out.println("start set: ");
		
	//	Set<MyInteger> set = new HashSet<MyInteger>();		
		Set<MyInteger> set = new TreeSet<MyInteger>();
		
	//	Set<Integer> set = new HashSet<Integer>();		
		set.clear();
		
		// only nonprimitive type can be used, object	
		set.add(new MyInteger(23));

		set.add(new MyInteger(23));
		
		set.add(new MyInteger(63));
		
		set.add(new MyInteger(43));
		
		set.add(new MyInteger(43));
		
		//set.add(23);
		
	//	set.add(23);

		//	set.add(new MyInteger(23));
			
		//	set.add(23);
			
		//	set.add(43);
		
	//	set.add(new MyInteger(23));
		
		for(MyInteger var : set){
			System.out.println(var);
		}
		
		System.out.println("end set: ");
		
		Set<String> sets = new HashSet<String>();
		
		// 2 objects created, becasue no new is used,
		// no object is created,
	// get from String pool
		
		// if use new key word, a new object is created,
		// but still only 2 values in set, 
		// becasue set uses hashcode/equals 
		// and treat as duplicate
		// so no new
		// no duplicates
		sets.clear();
		
		sets.add("hello");

		sets.add("world");
		
	//	sets.add("hello");
		
		sets.add(new String("hello"));
		
		for(String var : sets){
			System.out.println(var);
		}
				
		//sets.add(new MyInteger(33));
				
	MyInteger obj1 = new MyInteger(46);
	MyInteger obj2 = new MyInteger(56);
	
	// 2 different objects, check memory
    // false	
	System.out.println(obj1==obj2);
	
//different hashCode number	
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	
	// check value only
	System.out.println(obj1.equals(obj2));
	}

}

// set does not allow duplicates?
// why it allows here at MyInteger
// because we miss sth. here:
// we should use hashCode and equal to check duplicates
// and thus avoiding duplicates

class MyInteger implements Comparable<MyInteger>{
	Integer var;
	
	public MyInteger(Integer var) {
		this.var = var;		
	}
	
	@Override
	public String toString() {
		return var+"";
		// var.toString();
		// var+ "";
	}

	// Set use the 2 methods to check duplicates, 
	// so only one piece is created, 
	// no duplicate	
	@Override
	public int hashCode(){
		return var;
		
	}
	
	// if i use this, == checks memeory address only.
	// so 2 different objects will always be false
	// but:
	// equals checks both hashCode/equals
	// if both changed, then it is true now for 2 different objects
	@Override
	public boolean equals(Object obj){
		MyInteger myInteger = (MyInteger) obj;
		
		if(myInteger.var.equals(this.var)){			
			System.out.println(myInteger.var);
			System.out.println(this.var);		
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int compareTo(MyInteger o) {
		//return this.var - o.var;
		return o.var - this.var;
	}
	
}

// TreeSet: in order 