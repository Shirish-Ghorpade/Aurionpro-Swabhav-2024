package com.aurionpro.test;

import com.aurionpro.model.Addition;

public class AdditionTest {
	public static void main(String[] args) {
		
		Addition adder = (int number1, int number2)-> number1+number2;
		System.out.println(adder.addition(10, 20));
		test(adder);
		
	}
	private static void test(Addition adder) {
		System.out.println(adder.addition(10, 20));
	}
}
