package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int i=1; i<=n; i++) {
			Account account = new Account();
			System.out.println("Account "+Account.getCount()+" is created");
		}
	}

}
