package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double result = number1 / number2;
			System.out.println("Divison " + result);
		} catch (ArithmeticException exception) {
			System.out.println("Invalid input for number 2. it cannot be zero");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("number 2 is not given. Please enter number 2 also");
		} catch (NumberFormatException exception) {
			System.out.println("Please enter the numbers only");
		}
//		It is used to handle unknown exception . It should be last of all catch block
		catch (Exception exception) {
			System.out.println("Exception is occured");
		}
//		finally should be last
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("Exiting");
	}
}
