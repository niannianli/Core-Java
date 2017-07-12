package com.java.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// generic
public class GenericsDemo {
	
	public static void main(String[] args){
		
		Collection<Integer> c = new ArrayList<Integer>();
		List<Integer> l = new ArrayList<Integer>();
		
		// add one value: array with size one created
		// add second value: new array with size two created
		// arraylist is dynamic array
		
		// collection->list->arraylist	
		// collection->list->linkedlist
		
		List<Integer> ll = new LinkedList<Integer>();
		
		// values are connected by each other in linkedlist
		// object1(value1)<->object1(value2)
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		Test t1= new Test();
		Test t2= new Test();
		Test t3= new Test();
		
		t1.val = 10;
		t1.nextNode = t2;
		
		t2.val = 20;
		t2.nextNode = t3;
		
		t3.val = 20;
		t3.nextNode = null;
		
		//Set: HashSet, TreeSet
		// you can add duplicate values in list		
		// set does not allow duplicates
		
		GenericsDemo demo = new GenericsDemo();		
		// generally, hash code is random number
		System.out.println(demo.hashCode());
		
		// but in set, hash code is just the value
		// so if you add same value, the hash code is the same
		// so not treated as a new object, even it is
		// so will not be added
		Set<Integer> s = new HashSet<Integer>();
		
		// why this happens? v2 and v3 are differnt objects,
		// they should have unique hashcode
		// why same in set?
		// becuase set 's implementation is like String pool
		
		// if it can find the same value, it will just use object in String pool
		// instead of adding a new object
		// it overrides the hashcode function
		
		String str = "hello";
		String strpool = "hello";
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str.hashCode());
		System.out.println(strpool.hashCode());// same
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//equal only checks value which is the same
		System.out.println(str.equals(str1));
		System.out.println(str.equals(strpool));// same
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str2));
		// == checks memory, which are all differnt,
		System.out.println(str == str1);
		System.out.println(str == strpool);// should be differnt? but same, 
		// because of the use of string pool, no new memory is created.
		System.out.println(str == str2);
		System.out.println(str1 == str2);	
		
		Integer v1 = 20;
		Integer v2 = 10;
		Integer v3 = 10;
		
		// different objects, has diffent hash codes
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());
		
		s.add(10);
		s.add(10);
		s.add(20);
		
		System.out.println(s);
		
		// no dups, why?
		// because every object has a diffent/unique hash code
		
		// set uses hash algorithm
		// if you add a duplicate value
		//return same hashCode()
		
		// single method, can use differnt kinds of data
		Operation<Integer> clazz = new Operation<Integer>();
		clazz.display(34);
		clazz.add(43, 78);
		
		Operation<Double> clazz4 = new Operation<Double>();
		clazz4.add(43.88, 78.99);
		
	//	Operation<String> clazz1 = new Operation<String>();
	//	clazz1.display("hi");	
		
		Ope obj = new Ope();
	//	obj.add(45, 78);		
	//	obj.add("hello", "world");	
	//	obj.add(34.44, 56.44);
		
		int[] arr = {23, 34};
		
	//	why we use collection/data structure, not arr?
		// size is fixed
		// but mostly we do not know how much data we need
		
		//if we do this
		int[] arr1 = new int[7890000];
		// then thousands of memory are needed to be created in memroy
		// but you are not using them yet
	// waste
		
		// if use collection
		// object/memory will be created dynamiclly
		
		// collection // interface
		// just use it.
		
	//	collection: super interface of all interfaces
		
		// List is interface implemtns collection interface
		// Set is interface implements collection interface
	//	List: ArrayList, LinkedLis
		// Set: HashSet, TreeSet
		
		// Collection<E>
		
		// allocates size dynamicly
		Collection<Integer> col = new ArrayList<Integer>();
		col.add(34);
		System.out.println(col.size());
		col.add(78);
		System.out.println(col.size());
		
		col.remove(34);
		
		col.clear();
		
		Iterator<Integer> ite = col.iterator();
		
		while(ite.hasNext()){
			
			System.out.println(ite.next());
			
		}
		
		Set<MymyInteger> ss = new HashSet<MymyInteger>();
		
		MymyInteger mv1 = new MymyInteger(20);
		MymyInteger mv2 = new MymyInteger(10);
		MymyInteger mv3 = new MymyInteger(10);
		
		// different objects, has diffent hash codes
		System.out.println(mv1.hashCode());
		System.out.println(mv2.hashCode());
		System.out.println(mv3.hashCode());
		
		ss.add(mv1);
		ss.add(mv2);
		ss.add(mv3);
		
		// why duplicates are added?
		// because we have to override hashcode method
		// like set did for integer
		System.out.println(ss);
		
		// how to retrieve object
		// use iterator, or for loop

		for(MymyInteger i : ss){
			System.out.println(i);
		}
		
		// TreeSet
		// using sorting algorithms
		// same no dups
		Set<Integer> ssss = new TreeSet<Integer>();
		// increasing order by default
		
		ssss.add(50);
		ssss.add(46);
		ssss.add(90);
		
		System.out.println(ssss);
		
		// so how to make it in order?
		Set<MymyInteger> sss = new TreeSet<MymyInteger>();
		
		// ClassCastException
		// we need comparable class to put them in order
		sss.add(new MymyInteger(50));
		sss.add(new MymyInteger(46));
		sss.add(new MymyInteger(90));
		
		System.out.println(sss);
			
		// Map interface
		// Map<K, V> : key , value: index, value
		
		// Collection: List, Set
		// not map, does not implement Collection interface
		
		// Map: HashMap, TreeMap
	
		// HashMap: 
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(100, "one");
		// this will override the first value
		// as one key for one value only
		m.put(100, "oneone");
		m.put(200, "two");
		
		System.out.println(m.get(100));
		System.out.println(m.get(200));
		System.out.println(m.get(300));
		System.out.println(m);//{}like an array of data pairs
		
	//	m.clear();
	//	System.out.println(m);
		
		// entrySet()
		
	//Map.Entry<K, V>
		// one Entry is one pair of data including key and value
		
		// Entry inner interface of Map interface
		
		Set<Map.Entry<Integer, String>> entries = m.entrySet();
		
		// a set of entries
		
		for(Map.Entry<Integer, String> entry : entries){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		// keySet
		// key are unique, so use set works
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		// keyset because it is a set
		
		// value might be the same, so use collection only
		Collection<String> values = m.values();
		System.out.println(values);
		// no value set because it is not a set
		
		// hash algorithm only applys in key part: unique keys
		// value can be anything	
		MymyInteger key1 = new MymyInteger(10);
		MymyInteger key2 = new MymyInteger(20);
		MymyInteger key3 = new MymyInteger(30);
		MymyInteger key4 = new MymyInteger(30);
			
		//Map<MymyInteger, String> map = new HashMap<MymyInteger, String>();
		
		// in order
		Map<MymyInteger, String> map = new TreeMap<MymyInteger, String>();
		map.put(key1, "one");
		map.put(key2, "two");
		map.put(key3, "three");
		// overrids key3 with new value
		map.put(key4, "four");
		
		// this is fine for hashmap, but only one, no dups either
		// not working for tree map, becasue they need order
		//map.put(null, "seven");
		
		System.out.println(map);
			
		// TreeMap: key part must implement comparable interface
		// value part no check				
		// after java 1.5 only 
		
		// before java 1.5		
		// vector exists: similar to arraylist		
		// Vector<E> changes to generics after java 1.5
		
		// collection->List->vector uses same strucure algoirhtm like arraylist	
		// but there is difference		
		// arraylist maintian one array: handle multithreads: faster
		
		// vector: also maintain one array:evernthing in vector is synchronized
		// resource can be only accessed by one object only
		// vector object can be used at one time one thread: slower
		
		// Map: Hashtable
		// similar as vector, to HashMap: not syncrhonzed
		
		// changed to generice class
		// same logic
		// synchronized
		
		// Dictionary<K, V>: Hashtable
		// Map: Hashtable
		
		// Properties		
		// jdbc
		
		// dup checking: hashcode, equals	
		//order: comparable
		
	}

}


// Outer Map
// Inner Entry
interface Outer{
	interface Inner{
		
	}
}

// we need to use Comparable Interface to maintain order in treeset
class MymyInteger implements Comparable<MymyInteger>{
	private Integer value;
	
	public MymyInteger(Integer i){
		value = i;
	}
	
	@Override
	public String toString(){
		return value.toString();
	}
	
	// in conclusion:
	// set use both hashCode and equal function to avoid dups
		
	// now duplicates are not allowed? no override hashCode is not enough
	//?
	//equals method should also be overriden
	@Override
	public int hashCode(){
		return value;
	}
	
	// control keycut	
	// if the value is the same
	@Override
	public boolean equals(Object obj){
		
		MymyInteger mv = (MymyInteger)obj;
		
		// checks memroy: hashcode:
		if(this.value == mv.value){
			return true;
		}else{
			return false;
		}
		
	}

	
@Override
public int compareTo(MymyInteger obj) {
	if(this.value == obj.value){
		return 0;
	}else{
		// increasing order
		return this.value -obj.value;
		
		// decreasing order
		//return obj.value -this.value;
	}
}
	
}


// DWP
// bootstrap
// jsp

class Operation<T extends Number>{
	
	// you need to pass differnt kinds of values
	// multiple methods needed
	// is there an easier way to do this?
//	public void display(Integer parameter){
		
	//}
	
//	public void display(String paramter){
		
//	}
	
	T i;
	T j;
	
	public Operation(){
		
	}
	
	public Operation(T a){
		
	}
	
	public void display(T t){
		System.out.println(t);
	}
	
	public void add(T i, T j){
		// with single method, we can add different kinds of data
	//System.out.println(i + j);	
		Number a = i;
		Number b = j;
		
		// any number can be Double type
		System.out.println(a.doubleValue() + b.doubleValue());
		// any type		
	}
	
}

// docs.oracle.com/generics
class Ope{
	
	//why we do not use Object, instead we use Generic?
	//super class of all class, we can pass anything
	//but you have to check what kind of data you are passing
	// and convert them to the type to do furthure operation
	
	// if you are using generic, you do not need type casting
	// using upper bounded wildcards
	public void add(Object i, Object j){
		
		if(i instanceof Integer){
			Integer a = (Integer)i;
			Integer b = (Integer)j;
			System.out.println(a+b);
		}else if(i instanceof Double){
			Double a = (Double)i;
			Double b = (Double)j;
			System.out.println(a+b);
		}		
	}	
}

// structure of linkedlist
// add one value: one Test object is created: 
//storing its value & a node to connect to next object
class Test{
	Integer val;
	Test nextNode;
}
// why we are using linkedlist
// if you use arraylist: you can quickly getvalue, using index
//but if you want to delete a value:
// you can just change the connection
// it is faster using linkedlist

// if searching only, arraylist is better

//if array delete: have to create another array
// then have to shift the position of all affected values after deletion
// no good

// in big project: operation with multiple databases: multiple tables
// we need to create our own class and use generic

// collection: interfaces, classes to be used
// data structure: to store data

// limited hardware memory
// manage objects creation to save memory

// array

