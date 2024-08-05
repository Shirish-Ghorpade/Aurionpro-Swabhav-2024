package com.aurionpro.test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.threads.NewTask;

public class ExectorServiceTest {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
//		Here we do not create NewTaskTest method. here we directly call method here and store value in the future return type
		
		Future<Integer> future = service.submit(new NewTask());
		
//		try {
//			System.out.println(future.get());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		List<NewTask> tasks = new ArrayList<NewTask>();
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		try {
			List<Future<Integer>>futures =  service.invokeAll(tasks);
			
			for(Future<Integer> newFuture : futures) {
				try {
					System.out.println(newFuture.get());
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
