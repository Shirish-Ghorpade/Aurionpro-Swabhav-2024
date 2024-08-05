package com.aurionpro.solution.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	// Here we create the reference of interface IFestivalInterest and accept the
	// object of all classess which are implementing this inteface. so when we call
	// we can pass the object of any class that implements this interface
	IFestivalInterest interest;

	// When we create object of FixedDeposit
	// FixedDeposit fixedDeposit = new FixedDeposit(100, "Shirish", 1000.0, 5, new DiwaliInterest());
	
	
	public FixedDeposit(int accountNumber, String name, double principle, int duration, IFestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.interest = interest;
	}

	public IFestivalInterest getInterest() {
		return interest;
	}

	public void setInterest(IFestivalInterest interest) {
		this.interest = interest;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double calculateSimpleInterest() {
		return (principle * duration * interest.getInterestRate()) / 100;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + ", interest=" + interest.getInterestRate() + " simple interest is "
				+ calculateSimpleInterest() + "]";
	}

}