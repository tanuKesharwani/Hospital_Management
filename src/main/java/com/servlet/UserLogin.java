package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		//PrintWriter out = response.getWriter();  
		String username=request.getParameter("email");
		String password=request.getParameter("password");

	RequestDispatcher dispatcher=null;

		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/hospital","root","Tanu#110302");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from user where Email=? and Password=?");  
		ps.setString(1,username);  
		ps.setString(2,password);  
		      
		ResultSet rs=ps.executeQuery();  
		UserDetails user=new UserDetails();
		
		HttpSession session;
		
		if(rs.next()) {
			user.setId(rs.getInt("ID"));
			 user.setName(rs.getString("Name"));
			 user.setEmail(rs.getString("Email"));
			 user.setPassword(rs.getString("Password"));
		     session=request.getSession();
			
		      session.setAttribute("userD", user);

			  dispatcher = request.getRequestDispatcher("UserHome.jsp");
			  dispatcher.include(request, response);
			  
			  
		}
		else {
		//	out.print("not found");
			 dispatcher = request.getRequestDispatcher("login.jsp");
             dispatcher.include(request, response); 
		}
		}catch(Exception e){System.out.println(e);}  
		
		
		
		
	}

}
