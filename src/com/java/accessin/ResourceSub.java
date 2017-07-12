package com.java.accessin;

public class ResourceSub extends Resource {

	void callMe(){
		//same
		Resource resource = new Resource();
		Resource resource1 = new ResourceSub();
		
		//System.out.println(resource.pri);
		System.out.println(resource1.def);
		System.out.println(resource1.pro);
		System.out.println(resource1.pub);
	}
	
}
