package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long accountNumber;
		String name;
		double balance;
		double amount;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Enter the name of account holder ");
			name = scanner.nextLine();

			System.out.println("Enter the account balance");
			balance = scanner.nextDouble();

			accountNumber = setAccountNumber();

			Account account = new Account(accountNumber, name, balance);

			boolean exitOption = false;
			while (!exitOption) {

				System.out.println("----------------------------------------------------------------");
				System.out.println(account.getName() + " You can perform this operations");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit Money");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Exit");
				System.out.println("Please choose an option: ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Your current balance is " + account.getBalance());
					break;
				case 2:
					System.out.println("Enter the deposit amount");
					amount = scanner.nextDouble();
					account.credit(amount);
					break;
				case 3:
					System.out.println("Enter the withdrawl amount");
					try {
						amount = scanner.nextDouble();
						account.debit(amount);
					} catch (Exception exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 4:
					exitOption = true;
					System.out.println("Thank You !!!");
					break;
				default:
					System.out.println("Invalid input");
				}
			}
		} catch (InsufficientBalanceException exception) {
			// TODO: handle exception
			System.out.println(exception.getMessage());
		}
		catch (Exception exception) {
			// TODO: handle exception
			System.out.println(exception);
		}
	}

	private static long setAccountNumber() {
		Random random = new Random();
		return 10000000000L + (long) (random.nextDouble() * 9000000000L);
	}

}
