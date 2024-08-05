package com.aurionpro.test;

import com.aurionpro.model.ISayable;

public class ISayableTest {

	public static void main(String[] args) {
		
//		This is called a lambda expression

		ISayable sayable =()-> System.out.println("I am inside saylable");
		sayable.say();
		
		sayHello(sayable);
		
	}
	private static void sayHello(ISayable sayable) {
//		It stores the function definition inside the sayable variable 
		sayable.say();
	}

}
