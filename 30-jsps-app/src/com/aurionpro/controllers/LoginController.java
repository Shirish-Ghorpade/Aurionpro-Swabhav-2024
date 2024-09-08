package com.aurionpro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String userName = request.getParameter("username");
		Cookie cookie = new Cookie("username", userName);
		// cookie.setMaxAge(100000);
		response.addCookie(cookie);

		// Method 1
		// PrintWriter writer = response.getWriter();
		// writer.print(name);

		// Method 2
		response.getWriter().print("Welcome " + userName);
		response.getWriter().print("<form action = 'PasswordController'>");
		response.getWriter().print("Password : <input type='username' name='password'><br><input type='submit' name='go'>");
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
