package com.aurionpro.operators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second Number");
		int number2 = scanner.nextInt();
		scanner.close();
        
        // Equal to
        boolean isEqual = (number1 == number2); // false
        System.out.println("number1 == number2: " + isEqual);
        
        // Not equal to
        boolean notEqual = (number1 != number2); // true
        System.out.println("number1 != number2: " + notEqual);
        
        // Greater than
        boolean greaterThan = (number1 > number2); // true
        System.out.println("number1 > number2: " + greaterThan);
        
        // Less than
        boolean lessThan = (number1 < number2); // false
        System.out.println("number1 < number2: " + lessThan);
        
        // Greater than or equal to
        boolean greaterThanOrEqual = (number1 >= number2); // true
        System.out.println("number1 >= number2: " + greaterThanOrEqual);
        
        // Less than or equal to
        boolean lessThanOrEqual = (number1 <= number2); // false
        System.out.println("number1 <= number2: " + lessThanOrEqual);

	}

}

