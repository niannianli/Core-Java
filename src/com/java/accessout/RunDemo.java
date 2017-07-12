package com.java.accessout;

import com.java.accessin.RuninDemoAgain;

public class RunDemo {

	public static void main(String[] args) {
		
		RuninDemoAgain nian = new RuninDemoAgain();

		// System.out.println(nian.p); private: no: within class only
		// System.out.println(nian.d); default: within package only
		// System.out.println(nian.po); within package only, but
		// sometimes outside package: inheritance: how to access protected
		// outside package? through inheritance
		System.out.println(nian.pub);// public anywhere in project: no worry
	}
}

// skillgraph: inheritance: protected: