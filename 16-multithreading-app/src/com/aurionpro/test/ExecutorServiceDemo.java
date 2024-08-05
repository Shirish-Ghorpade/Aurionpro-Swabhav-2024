package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.threads.Task;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processors : "+coreCount);
		
//		ExecutorService service = Executors.newFixedThreadPool(coreCount);
//		ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i=0; i<1000; i++) {
			service.execute(new Task());
		}
	}
}
