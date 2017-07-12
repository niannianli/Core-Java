package com.java.thread;

public class Resource1 {

	// define method as synchronized
	// or define synchronized a block
	// synchronized: it means only one thread finished with the resource
	// then another thread can begin to use it
	// always in order
	// if not using synchronized, then mixed
	
	// 5 resources: 20 threads: not the reality
	// 1 resrouces: many threads: this is the case for synchronized
	public synchronized void callMe(){
		
Thread thread = Thread.currentThread();
		
		for (int i = 0; i < 100; i++) {
		//	Thread.sleep(1000);
			System.out.println(thread.getName() + i);
		}	
}
	
}
// especially bank account
// Runnable interface is better than Thread extends

// serilizable 

// input output
// write object

//1, create