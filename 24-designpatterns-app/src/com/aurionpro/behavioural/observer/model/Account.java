package com.aurionpro.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		notifiers = new ArrayList<INotifier>();
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

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void credit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		}
		balance += amount;
		for (INotifier noti : notifiers) {
			noti.giveNotification(this, "Credited");
		}
	}

	public void debit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		}
		if (amount > balance) {
			throw new InsufficientBalanceException(amount, balance);
		}
		this.balance -= amount;
		for (INotifier noti : notifiers) {
			noti.giveNotification(this, "debited");
		}
	}

	public void registerNotifier(INotifier notifierObj) {
		notifiers.add(notifierObj);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}

}
