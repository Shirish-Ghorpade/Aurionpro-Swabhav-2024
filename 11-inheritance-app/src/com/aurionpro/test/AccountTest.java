package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long accountNumber;
		String name;
		double balance;
		double amount;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		Account account = null;
		System.out.println("Enter the name of account holder ");
		name = scanner.nextLine();

		System.out.println("Enter the account balance");
		balance = scanner.nextDouble();

		accountNumber = setAccountNumber();
		
		System.out.println("Enter the type of account");
		System.out.println("1. Saving");
		System.out.println("2. Current");
		System.out.println("Enter the option");
		
		int response = scanner.nextInt();
		if(response != 1 && response != 2) {
			System.out.println("Invalid Input");
			return;
		}
		if (response == 1) {
			account = new SavingAccount(accountNumber, name, balance, 500);
		} 
		else if (response == 2) {
			account = new CurrentAccount(accountNumber, name, balance, 5000);
		}
		

		boolean exitOption = false;
		while (!exitOption) {

			System.out.println("----------------------------------------------------------------");
			System.out.println("Name : "+account.getName());
			System.out.println("Account Number : "+account.getAccountNumber());
			System.out.println("You can perform this operations on your "+(response==1 ? "Saving" : "Current")+" account." );
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
				amount = scanner.nextDouble();
				account.debit(amount);
				break;
			case 4:
				exitOption = true;
				System.out.println("Thank You !!!");
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
	private static long setAccountNumber() {
		Random random = new Random();
		return 10000000000L + (long) (random.nextDouble() * 9000000000L);
	}
}
