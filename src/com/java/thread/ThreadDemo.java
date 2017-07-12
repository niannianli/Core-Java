package com.java.thread;

import java.io.Serializable;

public class ThreadDemo {

	// generic
	// serialization: take object, covert, put back object
	// collection
	// multi thread

	public static void main(String[] args) throws InterruptedException {

		// ports: processes: threads:...

		System.out.println("");

		// synosyze:
		// music + worktool
		// within one process:one app
		// 2 threads created

		// 3 users: 3 processes
		// 1 million users: 1 millions processses?
		// definitely no.

		// CGI app: memory, system crash

		// so single process: servie multiple users
		// with multiple threads

		// Thread
		// run app: one main thread created
		// Thread thread = Thread.currentThread();
		// System.out.println(thread.getName());
		// return Thread object:

		// try {
		// thread.sleep(2000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// System.out.println(thread.getName());

		// System.out.println("Before");

		// Thread.sleep(4000);

		// System.out.println("Before");

		Resourc resource = new Resourc();
		
		// this is a new thread
		Thread t = new Thread(new MyRunable(resource));
		Thread t6 = new Thread(new MyRunable(resource));
		Thread t7 = new Thread(new MyRunable(resource));
		// Thread t2 = new Thread(new MyRunable());
		Thread t4 = new MyThread1();

		// set priority
		// it will try to complete the thread first,
		// but not for sure
		// only chances are higher than normal

		// 1-10: default:non-priority
	//	t.setPriority(Thread.MAX_PRIORITY);
		// t2.setPriority(Thread.MIN_PRIORITY);

		t.start();
		t6.start();
		t7.start();
		// t2.start();

		// main thread still exist at the same time
		// so 2 threads are working synchronisly now.
		// it will wait for the for loop to complete, instead, each of them will
		// run for sometime, randomly
		// jvm decides the order: we do not know

		/**
		 * for(int i=0; i<10; i++){ 
		 * Thread t1 = Thread.currentThread();
		 * System.out.println(t1.getName() + "..." + i); }
		 */

	//	t4.start();
	}

}

// interface: Runnable()
// just help you to create a thread

// you can also use Thread class constructor

// multiple threads: multiple users

// implement multiple interfaces in java: better
class MyRunable implements Runnable{
	
	private Resourc resource;

	public MyRunable(Resourc resource){
		
		this.resource = resource;
		
	}
	
	@Override
	public void run() {
		
	//	resource.execute();
		
		// is not synchronized
		//resource.show();
		
		// you can synchronized block
		
		// everything inside is synchronied, depiste the method
		synchronized(resource){
			resource.show();
		}
		}
	}


// extend only works for one class: not better
class MyThread1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName() + ".MyThread." + i);
		}
	}

}

// what if you want one thread to finish, then begin another thread?
// use synchronized
class Resourc {

	// synchronized method
	public synchronized void execute() {

		for (int i = 0; i < 10; i++) {

			Thread thread = Thread.currentThread();

			System.out.println(thread.getName() + "...Resource..." + i);
		}
	}
	
	public void show() {

		for (int i = 0; i < 10; i++) {

			Thread thread = Thread.currentThread();

			System.out.println(thread.getName() + "...Resource..." + i);
		}
	}
	
}

// single object: synchronized lock the object method: 
//then release object method for another thread

// collection framework
// generic

//jdbc
// hibernate

// web
// spring

// csv file
