package com.aurionpro.test;

import com.aurionpro.threads.RunnableThread;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		RunnableThread thread1 = new RunnableThread("Thread1");
		RunnableThread thread2 = new RunnableThread("Thread2");
		RunnableThread thread3 = new RunnableThread("Thread3");
		
		
		for(int i=5; i>0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
