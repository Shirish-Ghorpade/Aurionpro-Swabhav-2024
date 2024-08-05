//package com.aurionpro.creational.factory.test;
//
//import java.util.Scanner;
//
//import com.aurionpro.creational.factory.model.AccountFactory;
//import com.aurionpro.creational.factory.model.IAccount;
//
//public class AccountTest {
//
//	public static void main(String[] args) {
//		String name;
//		long balance;
//		boolean exitOption = false;
//		long amount;
//	
//		Scanner scanner = new Scanner(System.in);
//		
//		IAccount account;
//		
//		System.out.println("Enter the name of account holder ");
//		name = scanner.nextLine();
//		
//		
//		System.out.println("Enter the account balance");
//		balance = scanner.nextLong();
//		
//		
//		while(!exitOption) {
//			System.out.println("----------------------------------------------------------------");
//			System.out.println("1. Check Balance");
//			System.out.println("2. Deposit Money");
//			System.out.println("3. Withdraw Money");
//			System.out.println("4. Create Saving account");
//			System.out.println("5. Create Current account");
//			System.out.println("6. Exit");
//			System.out.println("Please choose an option: "); 
//			int response = scanner.nextInt();
//			switch (response) {
//				case 1:
//					System.out.println("Your current balance is "+account.getBalance());
//					break;
//				case 2:
//					System.out.println("Enter the deposit amount");
//					amount = scanner.nextLong();
//					account.credit(amount);
//					System.out.println("You deposited "+amount+" so, current balance of account number "+account.getAccountNumber()+" is "+account.getBalance());
//					break;
//	
//				case 3:
//					System.out.println("Enter the withdrawl amount");
//					amount = scanner.nextLong();
//					account.debit(amount);
//					System.out.println("You withdraw "+amount+" so, current balance of account number "+account.getAccountNumber()+" is "+account.getBalance());
//					break;
//				case 4: 
//					
//				case 6:
//					exitOption=true;
//					System.out.println("Thank You !!!");
//					break;
//				default:
//					System.out.println("Invalid input");
//			}
//		}		
//		
//	}
//
//}
