package com.aurionpro.behavioural.observer.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.behavioural.observer.model.Account;
import com.aurionpro.behavioural.observer.model.EmailNotifier;
import com.aurionpro.behavioural.observer.model.INotifier;
import com.aurionpro.behavioural.observer.model.SMSNotifier;
import com.aurionpro.behavioural.observer.model.WhatsappNotificer;

public class AccountTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		INotifier notifier;
		System.out.println("Enter the name of account holder ");
		String name = scanner.nextLine();
		
		
		System.out.println("Enter the account balance");
		double balance = scanner.nextLong();
	
		
		Account account = new Account(setAccountNumber(), name, balance);
		
		double amount;
		boolean exitOption = false;
		while(!exitOption) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. SMS notification");
			System.out.println("5. Email notification");
			System.out.println("6. Whatsapp notification");
			System.out.println("7. Exit");
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
//					System.out.println("You deposited "+amount+" so, current balance of account number "+account.getAccountNumber()+" is "+account.getBalance());
					break;

				case 3:
					System.out.println("Enter the withdrawl amount");
					amount = scanner.nextLong();
					account.debit(amount);
//					System.out.println("You withdraw "+amount+" so, current balance of account number "+account.getAccountNumber()+" is "+account.getBalance());
					break;
					
				case 4:
					notifier = (INotifier) new SMSNotifier();
					account.registerNotifier(notifier);
					break;
				case 5:
					notifier = (INotifier) new EmailNotifier();
					account.registerNotifier(notifier);
					break;
				case 6:
					notifier = (INotifier) new WhatsappNotificer();
					account.registerNotifier(notifier);
					break;
				case 7:
					exitOption=true;
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
