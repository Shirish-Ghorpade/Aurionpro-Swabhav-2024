package com.aurionpro.violation.model;

public class Labour implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour Start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stop the work");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour eat");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour drink");
	}

}
