package com.aurionpro.test;

import com.aurionpro.threads.CallMe;
import com.aurionpro.threads.CallerThread;

public class CallThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallMe target = new CallMe();
		
//		HERE Multiple threads working on same object. therefore problem arise.
//		

		CallerThread thread1 = new CallerThread("Hello", target);
		CallerThread thread2 = new CallerThread("Swabhav", target);
		CallerThread thread3 = new CallerThread("techlabs", target);

		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
