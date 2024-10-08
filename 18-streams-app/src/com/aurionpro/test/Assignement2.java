package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Assignement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Account> accounts = new ArrayList<Account>();

		accounts.add(new Account(1234, "Shirish", 10000.90));
		accounts.add(new Account(1345, "Chirag", 10.90));
		accounts.add(new Account(1234, "Devan", 100));
		accounts.add(new Account(1234, "Rohit", 50000.90));
		
		Optional<Account>minBalance = accounts.stream().min((account1, account2)->(int)(account1.getBalance()-account2.getBalance()));
		System.out.println("Min balance is "+minBalance);
		
		Optional<Account>maxBalance = accounts.stream().max((account1, account2)->(int)(account1.getBalance()-account2.getBalance()));
		System.out.println("Max balance is "+maxBalance);
		
		List<Account>namesGreatreThan6Char = accounts.stream().filter((account)->account.getName().length() > 6).collect(Collectors.toList());
		namesGreatreThan6Char.forEach((account)->System.out.println(account));
		
		double totalBalance = accounts.stream().map((account)->account.getBalance()).reduce((double) 0, (balance1, balance2)->balance1+balance2);
		System.out.println("Sum is "+totalBalance);		
		
	}

}
