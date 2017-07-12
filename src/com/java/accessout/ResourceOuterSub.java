package com.java.accessout;

import com.java.accessin.Resource;

public class ResourceOuterSub extends Resource {

	void callMe() {
		
		ResourceOuterSub resource = new ResourceOuterSub();

		// System.out.println(resource.pri);
		// System.out.println(resource.def);

		// this time, pro can be accessed outside package
		// because ResourceOuterSub is subclass of inside Resource
		System.out.println(resource.pro);
		System.out.println(resource.pub);
		
	}

}
