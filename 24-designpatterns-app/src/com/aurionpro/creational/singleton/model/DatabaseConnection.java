package com.aurionpro.creational.singleton.model;

public class DatabaseConnection {
	
	private static DatabaseConnection connection;
	private DatabaseConnection(){
		
	}
	public static DatabaseConnection getDatabaseConnection() {
		if(connection==null)
				connection = new DatabaseConnection();
		return connection;
	}
	public void status() {
		System.out.println("connected");
	}
}
