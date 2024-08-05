package com.aurionpro.model;

public class SavingAccount extends Account{
	private double MIN_BALANCE;


	public SavingAccount(long accountNumber, String name, double balance, double MIN_BALANCE) {
		super(accountNumber, name, balance);
		this.MIN_BALANCE = MIN_BALANCE;
	}

	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(double MIN_BALANCE) {
		this.MIN_BALANCE = MIN_BALANCE;
	}
	public void debit(double amount) {
		if (amount <= 0) {
			System.out.println("Amount cannot be negative or zero. Please enter correct amount");
			return;
		}
		if (amount > super.getBalance()-MIN_BALANCE) {
			System.out.println("Your minimum balance should be "+MIN_BALANCE+". Please enter smaller amount");
			return;
		} 
		double operation = super.getBalance()-amount;
		super.setBalance(operation);
		System.out.println("You withdraw " + amount + " so, current balance of account number "
				+ super.getAccountNumber() + " is " + super.getBalance());

	}

	
}
