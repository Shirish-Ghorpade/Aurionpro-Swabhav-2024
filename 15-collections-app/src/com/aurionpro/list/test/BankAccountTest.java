package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.list.model.BankAccount;
import com.aurionpro.list.model.CurrentAccount;
import com.aurionpro.list.model.InvalidInputException;
import com.aurionpro.list.model.MinBalanceExceedsException;
import com.aurionpro.list.model.NegativeOrZeroAmountException;
import com.aurionpro.list.model.OverDraftLimitExceedsException;
import com.aurionpro.list.model.SavingAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long accountNumber = 0;
		String name = null;
		double balance = 0.0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			List<BankAccount> accounts = new ArrayList<BankAccount>();
			boolean exitOption=false;
			while(!exitOption){
				System.out.println("Enter the name of account holder ");

				name = scanner.nextLine();

				System.out.println("Enter the account balance");

				balance = scanner.nextDouble();
				if (balance <= 0)
					throw new NegativeOrZeroAmountException(balance);

				accountNumber = setAccountNumber();

				System.out.println("Enter the type of account");
				System.out.println("1. Saving");
				System.out.println("2. Current");
				System.out.println("Enter the option");
				try {
					int response = scanner.nextInt();
					if (response != 1 && response != 2) {
						throw new InvalidInputException(response);
					}
					if (response == 1) {
						accounts.add(new SavingAccount(accountNumber, name, balance, 500));
					} else if (response == 2) {
						accounts.add(new CurrentAccount(accountNumber, name, balance, 5000));
					}
				} catch (Exception exception) {
					System.out.println(exception);
				}
				int size = accounts.size();
				System.out.println("Congratulation!! " + name + ". Your " + accounts.get(size-1).getBankAccountType()
						+ " Account generated sucessfully. Your " + accounts.get(size-1).getBankAccountType()
						+ " account number is " + accounts.get(size-1).getAccountNumber());
				
				System.out.println("Enter the option");
				System.out.println("0. Exit");
				System.out.println("1. Add one more account");
				int n = scanner.nextInt();
				if(n==0) {
					exitOption=true;
				}
				scanner.nextLine();
			}

			operations(accounts, scanner);
			sortInReverseOrder(accounts);
			System.out.println("-----------------------------------------");
			System.out.println("Maximum Account balance accounts is : ");
			maximumBalanceAccount(accounts);
			System.out.println("Details of accounts : ");
			displayDetailsOfAccounts(accounts, scanner);
		} catch (Exception exception) {
			// TODO: handle exception
			System.out.println(exception);
		}
	}

	private static long setAccountNumber() {
		Random random = new Random();
		return 10000000000L + (long) (random.nextDouble() * 9000000000L);
	}

	private static void operations(List<BankAccount> accounts, Scanner scanner) {
		for (int i = 0; i < accounts.size(); i++) {

			boolean exitOption = false;
			while (!exitOption) {

				System.out.println("----------------------------------------------------------------");
				System.out.println("Name : " + accounts.get(i).getName());
				System.out.println("Account Number : " + accounts.get(i).getAccountNumber());
				System.out.println("You can perform this operations on your " + accounts.get(i).getBankAccountType()
						+ " account.");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit Money");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Exit");
				System.out.println("Please choose an option: ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Your current balance is " + accounts.get(i).getBalance());
					break;
				case 2:
					System.out.println("Enter the deposit amount");
					try {
						double amount = scanner.nextDouble();
						accounts.get(i).credit(amount);
					} catch (NegativeOrZeroAmountException exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter the withdrawl amount");
					try {
						double amount = scanner.nextDouble();
						accounts.get(i).debit(amount);
					} catch (MinBalanceExceedsException exception) {
						System.out.println(exception.getMessage());
					} catch (OverDraftLimitExceedsException exception) {
						System.out.println(exception.getMessage());
					} catch (NegativeOrZeroAmountException exception) {
						System.out.println(exception.getMessage());
					} catch (Exception exception) {
						// TODO: handle exception
						System.out.println(exception);
					}
					break;
				case 4:
					exitOption = true;
					System.out.println("Thank You !!!");
					break;
				default:
					throw new InvalidInputException(choice);
				}
			}
		}
	}

	public static void displayDetailsOfAccounts(List<BankAccount> accounts, Scanner scanner) {
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
	}

	public static void sortInReverseOrder(List<BankAccount> accounts) {

		for (int i = 0; i < accounts.size(); i++) {
			for (int j = i+1; j < accounts.size(); j++) {
				if (accounts.get(i).getBalance() < accounts.get(j).getBalance()) {
					BankAccount temp = accounts.get(i);
					accounts.set(i, accounts.get(j));
					accounts.set(j, temp);
				}
			}
		}
	}

	public static void maximumBalanceAccount(List<BankAccount> accounts) {
		double firstMaximumBalanceAccount = accounts.get(0).getBalance();
		for (int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getBalance()==firstMaximumBalanceAccount) {
				System.out.println(accounts.get(i));
			}
		}
	}
}
