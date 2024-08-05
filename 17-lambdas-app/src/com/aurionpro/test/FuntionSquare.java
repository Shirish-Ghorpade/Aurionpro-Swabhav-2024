package com.aurionpro.test;

import java.util.function.Function;

public class FuntionSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function <Integer, Integer> squareFunction = (Integer number) -> number*number;
		
		System.out.println(squareFunction.apply(5));
	}

}
