package com.aurionpro.model;

import java.util.Random;

public class BankAccount {
	private long accountNumber;
	private String name;
	private long balance;
	
	public BankAccount() {
		this.accountNumber = 0;
		this.name = "Dumby name";
		this.balance = 0;
	}
	
	public BankAccount(long accountNumber, String n, long balance) {
		accountNumber = 0;
		name = "Dumby name";
		balance = 0;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber() {
		this.accountNumber = generateRandomNumber();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	private long generateRandomNumber() {
		Random random = new Random();
		return 10000000000L + (long) (random.nextDouble() * 9000000000L);
	}

	public void credit(long amount) {
		if(amount>0) balance+= amount;
		else System.out.println("Invaild");
	}

	public void debit(long amount) {
		if (amount <= 0) {
			System.out.println("Amount cannot be negative or zero. Please enter correct amount");
		} else if (amount > balance) {
			System.out.println("Amount is greater than balance. Please enter smaller amount");
		} else {
			this.balance -= amount;
		}
	}

}
