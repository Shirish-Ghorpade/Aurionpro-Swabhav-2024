package com.aurionpro.model;

public class AgeNotValidException extends RuntimeException {
	private int age;

	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age is not valid. You entered age is "+age;
	}

}
