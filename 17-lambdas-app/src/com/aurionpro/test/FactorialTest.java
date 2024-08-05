package com.aurionpro.test;

import com.aurionpro.model.Factorial;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial factorial = (int number)-> {
			int ans=1;
			for(int i=2; i<=number; i++) {
				ans *= i;
			}
			return ans;
		}; 
		
		System.out.println(factorial.factorial(3));
	}

}
