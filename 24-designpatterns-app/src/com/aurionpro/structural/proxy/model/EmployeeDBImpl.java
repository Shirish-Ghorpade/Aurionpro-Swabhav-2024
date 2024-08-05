package com.aurionpro.structural.proxy.model;

public class EmployeeDBImpl implements EmployeeDB{

	@Override
	public void create(String client, Employee obj) throws Exception {
		System.out.println("Create new row in table");
		
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Delete row with employeeId "+employeeId);
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Fetch the data from DB");
		return new Employee();
	}
	
}
