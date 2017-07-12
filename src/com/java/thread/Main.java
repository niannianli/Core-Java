package com.java.thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// task manager: process: 
		// computer: memory: process: threads
		Resource1 resource = new Resource1();
			
		Thread myThread = new MyThread(resource);
	//	myThread.setPriority(Thread.MIN_PRIORITY);
		// new thread created and current thread, both executes and interfere
		// with each other
		myThread.start();
		
		Thread myThread2 = new MyThread(resource);
	//	myThread2.setPriority(Thread.MIN_PRIORITY);
		// new thread created and current thread, both executes and interfere
		// with each other
		myThread2.start();
		
	//	Thread myThread1 = new Thread(new MyRunnable());
	//	myThread1.start();
		
		// only call the method, same current thread, one by one
		//myThread.run()
		
		//call start() method
		
		// JVM creates main thread
	//	Thread thread = Thread.currentThread();
		
	//	for (int i = 0; i < 3; i++) {
		//	Thread.sleep(1000);
		//	System.out.println(thread.getName() + i);
	//	}
		
		// main thread...
//		System.out.println(thread.getName());
		
	//	System.out.println("start");
		
	//	Thread.sleep(3000);
		
	//	System.out.println("end");
		
		// thread dump analyzer
		
		//Thread
		//Runnable	
		
	}

}


class MyThread extends Thread {
	
	Resource1 resource;
	
	public MyThread(Resource1 resource){
		this.resource = resource;
	}
	
	@Override
	public void run() {
		
	//	synchronized(resource) {
			resource.callMe();
	//	}
		
	//	resource.callMe();
		
	//	Thread thread = Thread.currentThread();
				
	//	for (int i = 0; i < 100; i++) {
			
		//	try{
			//	Thread.sleep(1000);
		//	}catch(Exception e){
		//	}	
			
		//	System.out.println(thread.getName() + i);
	//	}
			
		}
	}


/**
 Main difference is that 
 when program calls start() method 
 a new Thread is created 
 and code inside run() method is executed in new Thread 
 
 while if you call run() method directly 
 no new Thread is created and 
 code inside run() will execute on current Thread.

Another difference between start vs run in Java thread is that 
you can not call start() method twice on thread object. 
once started, second call of start() will throw IllegalStateException in Java 
while you can call run() method twice.
 */


// no priority is set: we can use setPriority();
class MyRunnable implements Runnable {

	@Override
	public void run() {
		// only an interface, not a class

		for (int i = 0; i < 100; i++) {		
		//	try{
			//	Thread.sleep(1000);
		//	}catch(Exception e){
		//	}	
			Thread thread = Thread.currentThread();			
			System.out.println(thread.getName() + i);
		}
	}
	
}


//all new threads are running sysconized
// which is not working in some scenarios
// it means only one thread can be running at a time
// what to do?
// Synchronization: one thread at a time