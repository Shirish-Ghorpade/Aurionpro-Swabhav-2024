package com.aurionpro.queue.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		// Insert an element and return true after successfully insertion
		System.out.println(deque.add("Shirish"));
		System.out.println(deque.add("Chirag"));
		// Insert an element
		System.out.println(deque.offer("Sarvesh"));
		// Insert at front of an queue and return true after successful insertion
		System.out.println(deque.offerFirst("nishank"));
		System.out.println(deque.offerLast("kaivalya"));
		// Used to retrieves not removes the head of the deque
		System.out.println(deque.element());
		// Used to retrieves not removes the head of the deque and return null if deque
		// is empty
		System.out.println(deque.peek());
		// Used to retrieves not removes the first element of the deque and return null if deque
		// is empty
		System.out.println(deque.peekFirst());
		// Used to retrieves not removes the last element of the deque and return null if deque
		// is empty
		System.out.println(deque.peekLast());
		// Used to remove and retrieves the head of the deque
		System.out.println(deque.remove());
		// Used to remove and retrieves the head of the deque and return null if deque
		// is empty
		System.out.println(deque.poll());
		System.out.println(deque.poll());
		System.out.println(deque.poll());
		System.out.println(deque.poll());

	}
}
