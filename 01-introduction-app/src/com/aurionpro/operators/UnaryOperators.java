package com.aurionpro.operators;

public class UnaryOperators {
//	Java unary operators are the types that need only one operand to perform any 
//	operation like increment, decrement, negation, etc.
	
//	Unary minus (-)
//	Used to negating the values
	void unaryMinus(int number) {
		System.out.println("The negating value of "+number+" to "+(-number));
	}
//	Used to convert true to false
	void unaryNOT(boolean flag) {
		System.out.println("Intially flag is "+flag+" after using NOT operator flag becomes "+(!flag));
	}
	void prePostIncrementDecrement(int number) {
//		Note : Increment and decrement operators we can apply for variables but not for cpnstant values.
//		temp=(++5);
		
		System.out.println("Intially number is "+ number);
//		Pre-increment -----> ++number = number+1
		
		int temp=++number;
//		int temp=--number;
//		int temp=number++;
//		int temp=number--;
		
		System.out.println("Value in temp after pre-increment "+temp);
		System.out.println("Value in number after pre-increment "+number);
	}
	
	public static void main(String[] args) {
		UnaryOperators obj = new UnaryOperators();
		obj.unaryMinus(90);
		obj.unaryNOT(true);
		obj.prePostIncrementDecrement(5);
	}

}
