package com.aurionpro.structural.proxy.model;

public interface EmployeeDB {
	public void create(String client, Employee obj) throws Exception;
	public void delete(String client, int employeeId) throws Exception;
	public Employee get(String client, int employeeId) throws Exception;
	
}
