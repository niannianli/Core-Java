package com.java.accessin;

public class InnerExd extends RuninDemoAgain {

	// Nian nian = new Nian();
	public static void main(String[] args) {

		InnerExd e = new InnerExd();

		// private, not working, because only within class
		// System.out.println(e.p);
		// default works: within package
		System.out.println(e.d);
		// protected works: within package and inheritance
		System.out.println(e.po);
		// publice works: anywhere
		System.out.println(e.pub);

	}
}
