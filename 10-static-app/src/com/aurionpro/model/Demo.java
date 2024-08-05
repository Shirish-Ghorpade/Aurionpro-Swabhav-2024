package com.aurionpro.model;

public class Demo {
	int a = 1;
	static int b = 1;
	int c = 1;

	public void increment() {
		a++;
		b++;
		c++;
	}

	public void display() {
		System.out.println("----------------------------------------");
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);
		System.out.println("c is :" + c);
	}
	
	static
	{
		System.out.println("Hellooooooo22222222222222222222");
	}
	
	{
		System.out.println("Hellooooooo22222222222222222222");
	}

}


