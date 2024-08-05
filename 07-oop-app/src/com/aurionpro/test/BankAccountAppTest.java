package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccountApp;
import com.aurionpro.model.AccountType;;


public class BankAccountAppTest {

	public static void main(String[] args) {
		
		String name=null;
		double balance=0;
		double amount=0;
		AccountType accountType=AccountType.SAVING;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many accounts you want to create ?");
		int n = scanner.nextInt();
		
//		Create array of object of BankAccount named as accounts
		BankAccountApp accounts[] = new BankAccountApp[n];
				
		for(int i=0; i<n; i++) {
			System.out.println("----------------------------------------------------");
			
			boolean inCorrectValues = true;
			
			scanner.nextLine();
			System.out.println("Enter the name of account holder ");
			while(inCorrectValues) {
//				Taking input from user
				name = scanner.nextLine();
				if(name.charAt(0) != ' ') {
					inCorrectValues=false;
				}
				else {
					System.out.println("Enter valid name");
				}
			}
			System.out.println("Enter the account balance");
			inCorrectValues = true;
			while(inCorrectValues) {
				balance = scanner.nextDouble();
				if(balance >= 0) {
					inCorrectValues=false;
				}
				else {
					System.out.println("Enter valid balance");
				}
			}
			System.out.println("Enter the type of account");
			inCorrectValues = true;
			while(inCorrectValues) {
				System.out.println("1. Saving");
				System.out.println("2. Current");
				System.out.println("Enter the option");;
				int response = scanner.nextInt();
				if(response==1) {
					accountType = AccountType.SAVING;
					inCorrectValues=false;
				}else if(response==2) {
					accountType = AccountType.CURRENT;
					inCorrectValues=false;
				}else{
					System.out.println("Invalid Input");
				}
			}
			
			
//			Enter the details of object and put object inside array of objects named as accounts
		
			accounts[i] = new BankAccountApp(name, balance, accountType);
			
//			Set the account for account object
			accounts[i].setAccountNumber();
			System.out.println("Congratulation!! "+name+". Your Account generated sucessfully. Your account number is "+accounts[i].getAccountNumber());
			
		}
		
		for(int i=0; i<n; i++) {
			boolean exitOption = false;
			while(!exitOption) {
				
				System.out.println("----------------------------------------------------------------");
				System.out.println(accounts[i].getName() +" You can perform this operations");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit Money");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Exit");
				System.out.println("Please choose an option: "); 
				int response = scanner.nextInt();
				switch (response) {
					case 1:
						System.out.println("Your current balance is "+accounts[i].getBalance());
						break;
					case 2:
						System.out.println("Enter the deposit amount");
						amount = scanner.nextLong();
						accounts[i].credit(amount);
						System.out.println("You deposited "+amount+" so, current balance of account number "+accounts[i].getAccountNumber()+" is "+accounts[i].getBalance());
						break;
					case 3:
						System.out.println("Enter the withdrawl amount");
						amount = scanner.nextLong();
						accounts[i].debit(amount);
						System.out.println("You withdraw "+amount+" so, current balance of account number "+accounts[i].getAccountNumber()+" is "+accounts[i].getBalance());
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
		
		
		BankAccountApp account = new BankAccountApp();
//		passing the array of object to the getMaximumBalanceAccount method
		account.getMaximumBalanceAccount(accounts);

	}

}
