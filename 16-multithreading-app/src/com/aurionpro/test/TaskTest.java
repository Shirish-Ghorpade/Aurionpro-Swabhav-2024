package com.aurionpro.test;

import com.aurionpro.threads.Task;

public class TaskTest {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
//			We can pass object in thread class (new Task() is an anonymous object of Task class) also or pass object inside the test.java
			Thread thread = new Thread(new Task());
			thread.start();
		}
	}

}
