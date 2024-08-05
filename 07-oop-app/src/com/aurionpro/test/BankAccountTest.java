package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		String name;
		long balance;
		boolean exitOption = false;
		long amount;
	
		Scanner scanner = new Scanner(System.in);
		
		BankAccount account = new BankAccount();
		
		System.out.println("Enter the name of account holder ");
		name = scanner.nextLine();
		
		
		System.out.println("Enter the account balance");
		balance = scanner.nextLong();
		
		account.setAccountNumber();
		
		while(!exitOption) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.println("Please choose an option: "); 
			int response = scanner.nextInt();
			switch (response) {
				case 1:
					System.out.println("Your current balance is "+account.getBalance());
					break;
				case 2:
					System.out.println("Enter the deposit amount");
					amount = scanner.nextLong();
					account.credit(amount);
					System.out.println("You deposited "+amount+" so, current balance of account number "+account.getAccountNumber()+" is "+account.getBalance());
					break;
	
				case 3:
					System.out.println("Enter the withdrawl amount");
					amount = scanner.nextLong();
					account.debit(amount);
					System.out.println("You withdraw "+amount+" so, current balance of account number "+account.getAccountNumber()+" is "+account.getBalance());
					break;
				case 4:
					exitOption=true;
					System.out.println("Thank You !!!");
					break;
				default:
					System.out.println("Invalid input");
			}
		}		
	}

}
