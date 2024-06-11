package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String admin=request.getParameter("admin");
	  String password=request.getParameter("password");
	  try {
		  if(admin.equals("admin@gmail.com") && password.equals("123")) {
			  response.sendRedirect("AdminIndex.jsp");
		  }
		  else {
			  response.sendRedirect("Admin.jsp");
		  }
			
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	 
		
		
	}

}
