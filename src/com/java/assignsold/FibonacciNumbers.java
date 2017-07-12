package com.java.assignsold;

public class FibonacciNumbers {

	// print Fibonacci numbers
	public static void main(String args[]) {

		// set first number 0, second number 1;
		// we can get third number: n3 = n1 + n2
		int n1 = 1;
		int n2 = 1;
		int n3;
		System.out.print(n1 + ",");
		System.out.print(n2 + ",");

		// now we need 10 numbers to be printed, set limit as 10
		int limit = 10;

		for (int i = 2; i < limit; i++) {
			n3 = n1 + n2;
			if (i == 9) {
				System.out.print(n3);
			} else {
				System.out.print(n3 + ",");
			}
			n1 = n2;
			n2 = n3;
		}

	}
}
