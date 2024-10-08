package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.dbconnection.DbUtil;
import com.aurionpro.entity.Transactions;

@WebServlet("/passbook")
public class PassBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DbUtil dbUtil = null;
	private PreparedStatement preparedStatement = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("username") == null) {
			response.sendRedirect("LoginPage.jsp");
			return;
		}
		dbUtil = DbUtil.getDbUtil();
		Connection connection = dbUtil.connectToDb();
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");

		try {
			int customerID = getCustomerId(username, password, connection);
			System.out.println("customerID is " +customerID);
			session.setAttribute("customerID", customerID);
			long senderAccountNumber = dbUtil.getSenderAccountNumber(customerID);
			System.out.println(senderAccountNumber);
			List<Transactions> transactionsList = new ArrayList<>();
			String sortType = request.getParameter("sort");
			String sqlQuery = "SELECT SenderAccountNumber, ReceiverAccountNumber, TransactionType, Amount, Date FROM transactions where SenderAccountNumber=?";

			if ("date".equals(sortType)) {
				sqlQuery += " ORDER BY Date";
			} else if ("type".equals(sortType)) {
				sqlQuery += " ORDER BY TransactionType";
			} else if ("amount".equals(sortType)) {
				sqlQuery += " ORDER BY Amount";
			}
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setLong(1, senderAccountNumber);
			ResultSet customerTransactionsDetails = preparedStatement.executeQuery();
			while (customerTransactionsDetails.next()) {
				transactionsList.add(new Transactions(customerTransactionsDetails.getLong("SenderAccountNumber"),
						customerTransactionsDetails.getLong("ReceiverAccountNumber"),
						customerTransactionsDetails.getString("TransactionType"),
						customerTransactionsDetails.getDouble("Amount"),
						customerTransactionsDetails.getString("Date")));
			}
			// System.out.println(transactionsList);
			request.setAttribute("transactionsList", transactionsList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ViewCustomerTransactions.jsp");
			requestDispatcher.forward(request, response);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int getCustomerId(String username, String password, Connection connection) throws SQLException {
		String query = "SELECT customerId FROM customers WHERE emailID=? AND password=?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					return resultSet.getInt("customerId");
				}
			}
		}
		return 0;
	}
}
