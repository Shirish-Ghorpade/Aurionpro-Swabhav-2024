package com.aurionpro.threads;

public class CallMe {
	
	
	public void call(String message) {
		System.out.print("[ "+message);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" ]");
	}
	
//	public synchronized void call(String message) {
//		System.out.print("[ "+message);
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(" ]");
//	}

}
