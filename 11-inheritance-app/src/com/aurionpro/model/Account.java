package com.aurionpro.model;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	
	public Account(long accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	Basic account credit and debit implementation. 
//	method is overriden in subclass like saving account and current account
	public void credit(double amount) {
		if (amount <= 0) {
			System.out.println("Invaild");
			return;
		}
		balance += amount;
		System.out.println("You deposited " + amount + " so, current balance of account number "
				+ getAccountNumber() + " is " + getBalance());
	}
	
	public void debit(double amount) {
		if (amount <= 0) {
			System.out.println("Amount cannot be negative or zero. Please enter correct amount");
			return;
		}
		if (amount > balance) {
			System.out.println("Amount is greater than balance. Please enter smaller amount");
			return;
		} 
		this.balance -= amount;
	}
}
