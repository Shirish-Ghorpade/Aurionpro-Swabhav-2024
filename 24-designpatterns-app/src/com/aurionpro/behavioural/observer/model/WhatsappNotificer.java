package com.aurionpro.behavioural.observer.model;

public class WhatsappNotificer implements INotifier{

	@Override
	public void giveNotification(Account account, String message) {
		// TODO Auto-generated method stub
		System.out.println(message+" Whatsapp : Account balance is "+account.getBalance());
		
	}
	
}
