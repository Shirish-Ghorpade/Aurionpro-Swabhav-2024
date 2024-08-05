package com.aurionpro.test;

import java.util.Scanner;

//import com.aurionpro.model.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the voter id");
			int voterId = scanner.nextInt();
			System.out.println("Enter the first name");
			String firstName = scanner.next();
			System.out.println("Enter the last name");
			String lastName = scanner.next();
			System.out.println("Enter the age");
			int age = scanner.nextInt();

			Voter voter = new Voter(voterId, firstName, lastName, age);
			System.out.println(voter);
		} catch (Exception exception) {
			// TODO: handle exception
			System.out.println(exception.getMessage());
		}
	}

}
