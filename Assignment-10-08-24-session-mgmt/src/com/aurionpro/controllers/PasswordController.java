package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PasswordController
 */
@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HttpSession session = request.getSession(false);
		String userName = (String) session.getAttribute("username");
		String password = request.getParameter("password");
		
	
		response.getWriter().print("Username "+userName+"\t");
		response.getWriter().print("Password "+password);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
