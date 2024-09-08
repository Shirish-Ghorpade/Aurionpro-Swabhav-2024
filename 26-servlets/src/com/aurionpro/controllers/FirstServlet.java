package com.aurionpro.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		
//		if we get single value as parameter then 
//		int number1 = Integer.parseInt(request.getParameter("number1"));
//		int number2 = Integer.parseInt(request.getParameter("number2"));
//		int result=number1+number2;
		
		
		
		
//		WHEN WE GET THE MULTIPLE PARAMTERS THEN WE USE getParametersValues
		
		String[] result = request.getParameterValues("getValues");
		
		for(String str : result) {
			writer.print(str);
		}
		
		
//		writer.print("Addition <b>"+result+"</b>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
