package com.java.accessin;

public class InnerClazz {

	public static void main(String[] args) {
		RuninDemoAgain nian = new RuninDemoAgain();

		// private could not be accessed outside class
		// System.out.println(nian.p);

		System.out.println(nian.d);
		System.out.println(nian.po);
		System.out.println(nian.pub);
	}

}
