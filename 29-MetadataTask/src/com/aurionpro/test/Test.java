package com.aurionpro.test;

import com.aurionpro.model.Account;

public class Test {
	public static void main(String[] args) {
		//Retrieving the ResultSetMetaData object
		Account account = new Account();
		account.connectToDB();
	}
}
