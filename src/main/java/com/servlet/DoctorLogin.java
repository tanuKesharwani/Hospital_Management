package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.DB.DBConnect;
import com.Dao.UserDao;

import Entity.DoctorDetails;
import Entity.UserDetails;

public class DoctorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
		DoctorDetails ds=new DoctorDetails();
		ds.setDoc_email(email);
		ds.setDoc_password(password);
		//System.out.println();
		UserDao uo=new UserDao(DBConnect.getConn());
		boolean f=uo.login(email, password);
		if(f==true) {
			System.out.println("login success");
			response.sendRedirect("DoctorHome.jsp");
		}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	
	
		
		
		
	}

}
