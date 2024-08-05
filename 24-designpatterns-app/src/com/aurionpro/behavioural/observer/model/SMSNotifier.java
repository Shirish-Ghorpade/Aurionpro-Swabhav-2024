package com.aurionpro.behavioural.observer.model;

public class SMSNotifier implements INotifier{

	@Override
	public void giveNotification(Account account, String message) {
		// TODO Auto-generated method stub
		System.out.println(message+" SMS : Account balance is "+account.getBalance());
		
	}
	

}
