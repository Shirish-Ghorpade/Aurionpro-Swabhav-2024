package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateGreaterOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer, Integer>greaterThan = (Integer number1, Integer number2)-> (number1>number2);
		System.out.println(greaterThan.test(0, 5));
	}

}
