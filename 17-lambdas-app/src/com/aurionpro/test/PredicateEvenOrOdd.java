package com.aurionpro.test;

import java.util.function.Predicate;

public class PredicateEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate <Integer>evenPredicate = (Integer number)-> (number%2==0);
		
		
		System.out.println(evenPredicate.test(5));
	}
}
