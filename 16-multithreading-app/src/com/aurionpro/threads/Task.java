package com.aurionpro.threads;

public class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread : "+Thread.currentThread().getName());
	}
	
}
