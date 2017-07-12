package com.java.basics;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main7 {

	// java i-o
	// 1, i type
	// 2, computer read, convert to binary,
	// store in CPU, go into pipe
	// 3, computer write out from pipe

	// Stream/Pipe
	// inputStream - outputStream

	public static void main(String[] args) {

		// implements Comparable<Integer>
		// defined, not able to change, increasing order
		// we should create MyInteger
		Set<Integer> collection = new TreeSet<Integer>(new MyComparator());

		collection.add(5);
		collection.add(45);
		collection.add(75);

		for (Integer var : collection) {
			System.out.println(var);
		}
	}

}

// use comparator interface to change order
// check value
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// increasing order
		// return o1 - o2;

		// decreasing order
		return o2 - o1;
	}

}

// Comparable: check for object
class MyComparable implements Comparable<Integer> {

	@Override
	public int compareTo(Integer o) {
		return 0;
	}

}
