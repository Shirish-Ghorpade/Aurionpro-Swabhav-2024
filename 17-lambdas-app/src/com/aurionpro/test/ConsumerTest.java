package com.aurionpro.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> consumer = (Integer number)-> System.out.println("Square is : "+number*number);
		
		consumer.accept(10);

	}

}
