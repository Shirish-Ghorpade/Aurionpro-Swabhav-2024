package com.aurionpro.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Student;

public class DbUtil {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	static DbUtil dbUtil = null;

	private DbUtil() {

	}

	public static DbUtil getDbUtil() {
		if (dbUtil == null) {
			return new DbUtil();
		}
		return dbUtil;
	}

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db10", "root", "root");
			statement = connection.createStatement();
			System.out.println("Connected sucessfully");

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error connecting to the database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public List<Student> getAllStudents() {
		ResultSet dbStudents = null;
		List<Student> students = new ArrayList<>();
		try {
			dbStudents = statement.executeQuery("select * from students");

			while (dbStudents.next()) {
				students.add(new Student(dbStudents.getInt("roll_no"), dbStudents.getString(2), dbStudents.getDouble(3)));
			}
			System.out.println("Sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in query");
			e.printStackTrace();
		}
		return students;
	}
}
