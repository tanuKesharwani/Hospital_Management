package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DB.DBConnect;
import com.Dao.UserDao;

import Entity.DoctorDetails;

/**
 * Servlet implementation class DoctorAdds
 */



public class DoctorAdds extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String DOB=request.getParameter("dob");
		String qualification=request.getParameter("qualification");
		String specialist=request.getParameter("specialist");
		String email=request.getParameter("email");
        int mobile=Integer.parseInt(request.getParameter("mobile"));
        String password=request.getParameter("password");
        
        
      //System.out.println(name+DOB+qualification+specialist+email+mobile+password);
		
        DoctorDetails dd=new DoctorDetails();
        dd.setDoc_name(name);;
        dd.setDOB(DOB);;
        dd.setQualification(qualification);
        dd.setSpecialist(specialist);
        dd.setDoc_email(email);
        dd.setDoc_mobile(mobile);
        dd.setDoc_password(password);
        
        UserDao ud=new UserDao(DBConnect.getConn());
        boolean f=ud.addDoctor(dd);
        HttpSession session=null;
        try {
        	 if(f) {
        		 session=request.getSession();
        		 session.setAttribute("msg1", "Doctor add Successfully");
        		 response.sendRedirect("DoctorAdd.jsp");
             	//System.err.println("doctor add successfully");
             	
             	
             	
             }
             else {
             	//System.out.println("server error");
             	 session=request.getSession();
        		 session.setAttribute("msg2", "Sever error");
        		 response.sendRedirect("DoctorAdd.jsp");
             	
             }
             
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
       
     
		
		
	}

}
