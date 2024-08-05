package com.aurionpro.structural.proxy.model;

public class ProxyDB implements EmployeeDB{
	
	EmployeeDB employeeDB;
	

	public ProxyDB() {
		this.employeeDB = new EmployeeDBImpl();
	}

	@Override
	public void create(String client, Employee obj) throws Exception {
		// TODO Auto-generated method stub
		if(client.equals("ADMIN")) {
			employeeDB.create(client, obj);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		if(client.equals("ADMIN")) {
			employeeDB.delete(client, employeeId);
			return;
		}
		throw new Exception("Access Denied");
		
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		if(client.equals("ADMIN") || client.equals("USER")) {
			return employeeDB.get(client, employeeId);
		
		}
		throw new Exception("Access Denied");
	}

}
