package com.ad.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ad.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//This Servlet is checking user and password to enter the program  using dao + MVC + JDBC 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("UserName");
		String p = request.getParameter("password");

		LoginDao daoL = new LoginDao();

		//out.print(daoL.getLogin(n).getUsername());
		// w
		if (daoL.getLogin(n,p).getUsername() != null && daoL.getLogin(n,p).getPassword()!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else {
			out.print("Sorry! UserName or Password is Wrong!");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.include(request, response);

		}
	}

}
