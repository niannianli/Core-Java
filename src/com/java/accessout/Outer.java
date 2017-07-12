package com.java.accessout;

import com.java.accessin.Resource;

public class Outer {
	
	void callMe(){
		Resource resource = new Resource();
		
		//System.out.println(resource.pri);
		//System.out.println(resource.def);
	//	System.out.println(resource.pro);
		System.out.println(resource.pub);
	}
	
}
