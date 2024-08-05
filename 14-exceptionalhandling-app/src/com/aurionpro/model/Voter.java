package com.aurionpro.model;

public class Voter {

	private int voterId;
	private String firstName;
	private String lastName;
	private int age;

	public Voter(int voterId, String firstName, String lastName, int age) {
		super();
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		if (age < 18) {
			throw new AgeNotValidException(age);
		}
		this.age = age;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", getVoterId()=" + getVoterId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void setAge(int age) {
		if (age < 18) {
			throw new AgeNotValidException(age);
		}
		this.age = age;
	}
}
