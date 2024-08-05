package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		
		list.add("Shirish");
		list.add("Chirag");
		list.add("Devan");
		list.add("Chirag");
		
		list.remove("Chirag");
		System.out.println(list.contains("Chirag"));
		System.out.println(list.size());
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String name : list) {
			System.out.println(name);
		}
		ListIterator<String>listIterator = list.listIterator();
		
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
