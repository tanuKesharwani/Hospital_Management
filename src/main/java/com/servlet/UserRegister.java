package com.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DB.DBConnect;
import com.Dao.UserDao;

import Entity.UserDetails;



/**
 * Servlet implementation class UserRegister
 */

public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println(name+email+password);
		UserDetails us=new UserDetails();
		us.setName(name);
		us.setEmail(email);
		us.setPassword(password);
		
		UserDao ud = null;
		try {
			ud = new UserDao(DBConnect.getConn());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f=ud.addUser(us);
		HttpSession session;
		
		try {
			if(f) {
			session=(HttpSession) request.getSession();
			 session.setAttribute("msg","Registration successully");
			 response.sendRedirect("User.jsp");
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
			
			
			
		}


	
	
	}
	
	


