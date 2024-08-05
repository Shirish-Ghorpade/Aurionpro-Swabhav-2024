package com.aurionpro.test;

import com.aurionpro.threads.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread1 = new MyThread("Thread1"); //---> At this state is born state
		MyThread thread2 = new MyThread("Thread2"); //---> At this state is born state
		MyThread thread3 = new MyThread("Thread3"); //---> At this state is born state
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
//		we can write start here or we can start in constructor of object. So whenever the object is created the state is calls start method
//		thread1.start(); // ---> when start execute then runnable start 
		
//		thread1.setPriority(10);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.NORM_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		
		try {
			thread1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			thread2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			thread3.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=5; i>0; i--) {
//			Here we get the name of thread
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
	}

}
