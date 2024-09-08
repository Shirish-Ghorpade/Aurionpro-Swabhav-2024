package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class Test {
	public static void main(String[] args) {
		DbConnection dbConnection = new DbConnection();
		dbConnection.connectToDb();
		dbConnection.getStudentDetails();
		dbConnection.addStudent();
		dbConnection.getStudentDetails();
		dbConnection.updateStudent();
		dbConnection.getStudentDetails();
	}
}
