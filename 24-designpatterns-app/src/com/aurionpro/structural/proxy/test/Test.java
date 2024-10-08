package com.aurionpro.structural.proxy.test;

import com.aurionpro.structural.proxy.model.Employee;
import com.aurionpro.structural.proxy.model.EmployeeDB;
import com.aurionpro.structural.proxy.model.ProxyDB;

public class Test {
	public static void main(String[] args) {
//		Client communicate with the real object through proxy object
//		Access restriction
//		Caching
//		pre-process or post-process 
		
		try {
			EmployeeDB empObj = new ProxyDB();
			empObj.create("ADMIN", new Employee());
			empObj.delete("ADMIN", 1243);;
			empObj.get("ADMIN", 1234);
			System.out.println("Operation sucessful");
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
