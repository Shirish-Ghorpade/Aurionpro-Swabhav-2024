package com.aurionpro.behavioural.observer.model;

public class EmailNotifier implements INotifier{

	@Override
	public void giveNotification(Account account, String message) {
		// TODO Auto-generated method stub
		System.out.println(message+" Email : Account balance is "+account.getBalance());
	}
	
}
