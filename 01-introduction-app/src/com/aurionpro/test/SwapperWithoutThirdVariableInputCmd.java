package com.aurionpro.test;

public class SwapperWithoutThirdVariableInputCmd {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		System.out.println("Before Swapping");
		System.out.println("Number1 : "+ number1 + "\t Number2 : "+ number2);
		
//		Swapping the two numbers
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("After Swapping");
		System.out.println("Number1 : "+ number1 + "\t Number2 : "+ number2);


	}

}
