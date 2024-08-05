package com.aurionpro.model;

public class Employee {
	private int employeeId;
	private String name;
	private int salary;
	
	public Employee() {
		this.employeeId=0;
		this.name="Dummy";
		this.salary = 0;
	}
	public Employee(int employeeId, String name, int salary) {
		this.employeeId=employeeId;
		this.name=name;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
}

