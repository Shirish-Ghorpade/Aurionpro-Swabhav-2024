package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.DatabaseConnection;

public class DatabaseConnectionTest {
	public static void main(String[] args) {
		DatabaseConnection databaseConnection = DatabaseConnection.getDatabaseConnection();
		databaseConnection.status();
		
		DatabaseConnection databaseConnection1 = DatabaseConnection.getDatabaseConnection();
		databaseConnection1.status();
	}
}
