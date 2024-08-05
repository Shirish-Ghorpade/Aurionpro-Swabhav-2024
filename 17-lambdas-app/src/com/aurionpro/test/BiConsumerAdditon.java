package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BiConsumerAdditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer, Integer>adder = (Integer number1, Integer number2)->{
			System.out.println("Addition: "+(number1+number1));
		};
		
		adder.accept(10, 20);

	}

}
