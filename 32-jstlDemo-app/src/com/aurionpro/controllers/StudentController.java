package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.entity.Student;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DbUtil dbUtil = null;
	private RequestDispatcher dispatcher = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		dbUtil = DbUtil.getDbUtil();
		dbUtil.connectToDb();

		List<Student> students = dbUtil.getAllStudents();
		request.setAttribute("students", students);
		dispatcher = request.getRequestDispatcher("/StudentView.jsp");
		dispatcher.forward(request, response);

	}

}
