package com.aurionpro.test;

import com.aurionpro.model.Number;
public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number number1 = new Number(10);
		Number number2 = new Number(20);
		
		System.out.println("before swapping :");
		System.out.println("Number 1 is "+number1.getNumber()+" number 2 is "+number2.getNumber());
		
		swap(number1, number2);
		
		System.out.println("After swapping :");
		System.out.println("Number 1 is "+number1.getNumber()+" number 2 is "+number2.getNumber());
	
	}
	public static void swap(Number number1, Number number2) {
		int temp = number1.getNumber();
		number1.setNumber(number2.getNumber());
		number2.setNumber(temp);
	}

}
