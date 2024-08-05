package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayments;
import com.aurionpro.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment payment;
		payment = new CreditCardPayment();
		payment.processPayments();
		payment.refund();
		
		
		payment = new PayPalPayments();
		payment.processPayments();
		payment.refund();
		
		
		payment = new BankTransferPayment();
		payment.processPayments();
	}

}
