package com.aurionpro.operators;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();

        // Bitwise AND (&)
        int andResult = number1 & number2;
        System.out.println("Bitwise AND of " + number1 + " & " + number2 + " = " + andResult);

        // Bitwise OR (|)
        int orResult = number1 | number2;
        System.out.println("Bitwise OR of " + number1 + " | " + number2 + " = " + orResult);

        // Bitwise XOR (^)
        int xorResult = number1 ^ number2;
        System.out.println("Bitwise XOR of " + number1 + " ^ " + number2 + " = " + xorResult);

        // Bitwise Complement (~) of number1
        int complementResult1 = ~number1;
        System.out.println("Bitwise Complement of " + number1 + " = " + complementResult1);

        // Bitwise Complement (~) of number2
        int complementResult2 = ~number2;
        System.out.println("Bitwise Complement of " + number2 + " = " + complementResult2);

        // Left Shift (<<) of number1 by 2 positions
        int leftShiftResult1 = number1 << 2;
        System.out.println("Left Shift of " + number1 + " by 2 positions = " + leftShiftResult1);

        // Left Shift (<<) of number2 by 2 positions
        int leftShiftResult2 = number2 << 2;
        System.out.println("Left Shift of " + number2 + " by 2 positions = " + leftShiftResult2);

        // Right Shift (>>) of number1 by 2 positions
        int rightShiftResult1 = number1 >> 2;
        System.out.println("Right Shift of " + number1 + " by 2 positions = " + rightShiftResult1);

        // Right Shift (>>) of number2 by 2 positions
        int rightShiftResult2 = number2 >> 2;
        System.out.println("Right Shift of " + number2 + " by 2 positions = " + rightShiftResult2);

        // Unsigned Right Shift (>>>) of number1 by 2 positions
        int unsignedRightShiftResult1 = number1 >>> 2;
        System.out.println("Unsigned Right Shift of " + number1 + " by 2 positions = " + unsignedRightShiftResult1);

        // Unsigned Right Shift (>>>) of number2 by 2 positions
        int unsignedRightShiftResult2 = number2 >>> 2;
        System.out.println("Unsigned Right Shift of " + number2 + " by 2 positions = " + unsignedRightShiftResult2);

        scanner.close();
	}
}
