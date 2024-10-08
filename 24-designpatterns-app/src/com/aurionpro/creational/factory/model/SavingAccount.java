//package com.aurionpro.creational.factory.model;
//
//import com.aurionpro.creational.factory.test.AccountType;
//
//public class SavingAccount implements IAccount{
//	private long accountNumber;
//	private String name;
//	private double balance;
//	private AccountType bankAccountType;
//	
//	public SavingAccount(long accountNumber, String name, double balance,AccountType bankAccountType) {
//		super();
//		this.accountNumber = accountNumber;
//		this.name = name;
//		this.balance = balance;
//		this.bankAccountType = bankAccountType;
//	}
//	
//	public long getAccountNumber() {
//		return accountNumber;
//	}
//
//	public void setAccountNumber(long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public AccountType getBankAccountType() {
//		return bankAccountType;
//	}
//
//	public void setBankAccountType(AccountType bankAccountType) {
//		this.bankAccountType = bankAccountType;
//	}
//
//	@Override
//	public void credit(double amount) {
//		// TODO Auto-generated method stub
//		if(amount < 0) {
//			System.out.println("Negative value");
//			return;
//		}
//		System.out.println(amount+" is credited");
//		
//		
//	}
//
//	@Override
//	public void debit(double amount) {
//		// TODO Auto-generated method stub
//		if(amount < 0) {
//			System.out.println("Negative value");
//			return;
//		}
//		if(amount > balance) {
//			System.out.println(amount+" is credited");
//			return;
//		}
//		System.out.println(amount+" is debited");
//	}
//
//}
