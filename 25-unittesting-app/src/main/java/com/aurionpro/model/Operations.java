package com.aurionpro.model;

public class Operations {
	int addition(int number1, int number2) {
		return number1+number2;
	}
	int subtraction(int number1, int number2) {
		return number1-number2;
	}
	int multiplication(int number1, int number2) {
		return number1*number2;
	}
	int divison(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException();
		return number1/number2;
	}
	boolean isEven(int number) {
		return number%2==0;
	}
}
