package com.aurionpro.model;

public class CurrentAccount extends Account {
	private double OVER_DRAFT_LIMIT;
	private double loan = 0;

	public CurrentAccount(long accountNumber, String name, double balance, double OVER_DRAFT_LIMIT) {
		super(accountNumber, name, balance);
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
	}

	public double getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}

	public void setOVER_DRAFT_LIMIT(double OVER_DRAFT_LIMIT) {
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
	}

	public void credit(double amount) {
		if (amount <= 0) {
			System.out.println("Amount is should not be negative or zero");
			return;
		}
		else if (loan == 0) {
			super.setBalance(super.getBalance() + amount);
		}
		else if (amount < Math.abs(loan)) {
			loan += amount;
		}
		else if(amount==Math.abs(loan)) {
			loan=0;
		}
		else if (amount > loan) {
			super.setBalance(amount - loan);
		}
		System.out.println("You deposited " + amount + " so, current balance of account number "
				+ super.getAccountNumber() + " is " + super.getBalance() + " and your remaining loan is " + Math.abs(loan));
		

	}

	public void debit(double amount) {
		if (amount <= 0) {
			System.out.println("Amount cannot be negative or zero. Please enter correct amount");
			return;
		}
		if (amount > super.getBalance() + OVER_DRAFT_LIMIT) {
			System.out.println(
					"Amount is greater than balance and also exceeds the over draft limit. Please enter smaller amount");
			return;
		}
		loan = super.getBalance() - amount;
		super.setBalance(0);
		System.out.println(
				"Now your account balance is " + super.getBalance() + " and you have loan of " + Math.abs(loan));
	}

}
