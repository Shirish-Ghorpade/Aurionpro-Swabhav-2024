package com.aurionpro.model;
import java.util.ArrayList;


import java.util.Random;
import com.aurionpro.model.AccountType;

public class BankAccountApp {

	private long accountNumber;
	private String name;
	private double balance;
	private AccountType accountType;
	

//  Constructors
	public BankAccountApp() {
		this.accountNumber = 0;
		this.name = "Not get value yet";
		this.balance = 0.0;
		this.accountType = AccountType.SAVING;
	}
	
	public BankAccountApp(String name, double balance, AccountType accountType) {
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}
	
//	Getters and Setters
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	Methods
	private long generateRandomNumber() {
		Random random = new Random();
		return 10000000000L + (long) (random.nextDouble() * 9000000000L);
	}

	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Invaild");
		}
	}

	public void debit(double amount) {
		if (amount <= 0) {
			System.out.println("Amount cannot be negative or zero. Please enter correct amount");
		} else if (amount > balance) {
			System.out.println("Amount is greater than balance. Please enter smaller amount");
		} else {
			this.balance -= amount;
		}
	}
	public void getMaximumBalanceAccount(BankAccountApp accounts[]) {
		double maxBalance=0;
		ArrayList<Long>maxBalanceAccountHolders = new ArrayList<Long>();
		for(int i=0; i<accounts.length; i++)
		{
			double currentBalance=accounts[i].balance;
			if(currentBalance > maxBalance) {
				maxBalance = currentBalance;
			}
		}
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i].balance == maxBalance) {
				maxBalanceAccountHolders.add(accounts[i].accountNumber);
			}
		}
		System.out.print("This accounts numbers have ");
		for(int i=0; i<maxBalanceAccountHolders.size(); i++) {
			System.out.print(maxBalanceAccountHolders.get(i)+", ");
		}
		System.out.println("maximum balance "+ maxBalance);
	}
}