package com.aurionpro.model;

public class Account {
	static int count=0;
	
	{
		count++;
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Account.count = count;
	}
	
}
