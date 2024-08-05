package com.aurionpro.model;

public class CreditCardPayment implements Payment{

	@Override
	public void processPayments() {
		// TODO Auto-generated method stub
		System.out.println("Process is credit method");
	}
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("refund is credit method");
	}

}
