package com.aurionpro.test;

import java.util.function.BiFunction;

public class BiFunctionAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer>adder = (Integer n1, Integer n2)-> n1+n2; 
		
		System.out.println(adder.apply(10, 20));

	}

}
