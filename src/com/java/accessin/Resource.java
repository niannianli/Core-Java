package com.java.accessin;

public class Resource {
	
	private String pri = "PRIVATE"; // within class
	String def ="Default"; // inside the package
	protected String pro = "PROTECTED"; //inside package; outside package: only inheritance
	public String pub = "PUBLIC";//anywhere in project
	
	void callMe(){
		Resource resource = new Resource();
		
		System.out.println(resource.pri);
		System.out.println(resource.def);
		System.out.println(resource.pro);
		System.out.println(resource.pub);
	}
		
}
