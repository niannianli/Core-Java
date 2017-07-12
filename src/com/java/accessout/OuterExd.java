package com.java.accessout;

import com.java.accessin.RuninDemoAgain;

public class OuterExd extends RuninDemoAgain {

	//Nian nian = new Nian();
		public static void main(String[] args){
			
			OuterExd e = new OuterExd();
			
		// private, not working, because only within class	
		//System.out.println(e.p);
			
		// default does not works: outside package
	//	System.out.println(e.d);
		
		// protected works: outside package but inheritance
			// from original package
		System.out.println(e.po);
		
		// public works: anywhere
		System.out.println(e.pub);
		
		}
}


// polymorphism
// mobile phone: calls, games, 
// one interface: multiple implementation
