package com.aurionpro.map.test;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer, String>map = new HashMap<Integer, String>();
//		
//		map.put(5, "chirag");
//		map.put(4, "shirish");
//		map.put(7, "vinayak");
//		System.out.println(map);
//		LinkedHashMap<Integer, String>map1 = new LinkedHashMap<Integer, String>();
//		
//		map1.put(5, "chirag");
//		map1.put(4, "shirish");
//		map1.put(7, "vinayak");
//		System.out.println(map1);
		
		
		TreeMap<Integer, String>entries = new TreeMap<Integer, String>();
		entries.put(5, "chirag");
		entries.put(4, "shirish");
		entries.put(7, "vinayak");
		System.out.println(entries);
		
		Set<Entry<Integer, String>> entries1 = entries.entrySet();
		for(Entry <Integer, String> entry : entries1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
