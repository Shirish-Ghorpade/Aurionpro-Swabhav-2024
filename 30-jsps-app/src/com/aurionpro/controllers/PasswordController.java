package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordController
 */
@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		cookie is generated at server (ClientController) side and send to client (PasswordController)
//		So here ClientController sends username using cookies
		Cookie[] cookies = request.getCookies();
		
		String password = request.getParameter("password");
//		So, now whenever client sends response they send cookies to server
		response.getWriter().print("Username "+cookies[0].getValue()+"\t");
		response.getWriter().print("Password "+password);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
