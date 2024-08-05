package com.aurionpro.threads;

public class CallerThread implements Runnable{

	private String message;
	private CallMe target;
	private Thread thread;
	
	public Thread getThread() {
		return thread;
	}
	
	public CallerThread(String message, CallMe target) {
		super();
		this.message = message;
		this.target = target;
		this.thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		target.call(message);
		
		synchronized (target) {
			target.call(message);
		}
	}

}
