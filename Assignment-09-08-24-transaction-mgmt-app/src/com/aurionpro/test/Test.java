package com.aurionpro.test;

import com.aurionpro.model.TransactionManagement;

public class Test {
	public static void main(String[] args) {
		TransactionManagement transactionManagement = new TransactionManagement();
		transactionManagement.connectToDB();
	}
}
