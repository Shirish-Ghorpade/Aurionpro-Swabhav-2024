package com.aurionpro.queue.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
//		Insert an element and return true after successfully insertion
		System.out.println(queue.add("Shirish"));
		System.out.println(queue.add("Chirag"));
		System.out.println(queue.add("Anuj"));
		System.out.println("----------------------------------------");
//		Insert an element
		System.out.println(queue.offer("Sarvesh"));
		System.out.println("----------------------------------------");
		System.out.println(queue);
//		Used to retrieves not removes the head of the queue
		
		System.out.println(queue.element());
		System.out.println("------------------------------------------");
//		Used to retrieves not removes the head of the queue and return null if queue is empty
		System.out.println("-------------------------------------------");
		System.out.println(queue.peek());
//		Used to remove and retrieves the head of the queue
		System.out.println(queue.remove());
//		Used to remove and retrieves the head of the queue and return null if queue is empty
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		Queue<String> queue1 = new LinkedList<String>();
//		Insert an element and return true after successfully insertion
		System.out.println(queue1.add("Shirish"));
		System.out.println(queue1.add("Chirag"));
		System.out.println(queue1.add("Anuj"));
		System.out.println("----------------------------------------");
//		Insert an element
		System.out.println(queue1.offer("Sarvesh"));
		System.out.println("----------------------------------------");
		System.out.println(queue1);
//		Used to retrieves not removes the head of the queue
		
		System.out.println(queue1.element());
		System.out.println("------------------------------------------");
//		Used to retrieves not removes the head of the queue and return null if queue is empty
		System.out.println("-------------------------------------------");
		System.out.println(queue1.peek());
//		Used to remove and retrieves the head of the queue
		System.out.println(queue1.remove());
//		Used to remove and retrieves the head of the queue and return null if queue is empty
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		
	}

}
