package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionManagement {
	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	Scanner scanner = new Scanner(System.in);

	public void connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			System.out.println("Sucess !!!!!!!!!");
			connection.setAutoCommit(false);
			String withdrawQuery = "update accounts set balance = balance - ? where account_number = ?";
			String depositQuery = "update accounts set balance = balance + ? where account_number = ?";
			try {
				PreparedStatement withdraw = connection.prepareStatement(withdrawQuery);
				PreparedStatement deposit = connection.prepareStatement(depositQuery);
				withdraw.setDouble(1, 500.0);
				withdraw.setString(2, "account123");
				deposit.setDouble(1, 500.0);
				deposit.setString(2, "account456");
				int rowsAffectedWithdraw = withdraw.executeUpdate();
				int rowsAffectedDeposit = deposit.executeUpdate();
				if (rowsAffectedDeposit == 0 || rowsAffectedWithdraw == 0) {
					connection.rollback();
					System.out.println("Transaction Failed");
					return;
				}
				connection.commit();
				System.out.println("Transaction is sucessful");

			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
}
