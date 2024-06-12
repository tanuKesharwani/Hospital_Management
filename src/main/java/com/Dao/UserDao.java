package com.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.print.Doc;

import org.apache.catalina.connector.Response;

import Entity.DoctorDetails;
import Entity.UserDetails;
import jakarta.servlet.http.HttpSession;




public class UserDao {
    private Connection conn;
    public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
    
    
public boolean addUser(UserDetails us) {
		
		boolean f=false;
		try {
			PreparedStatement ps=conn.prepareStatement(  
					"insert into User(Name,Email,Password) values(?,?,?)");  

						 
						
						ps.setString(1,us.getName());  
						ps.setString(2,us.getEmail());  
						ps.setString(3,us.getPassword());  
					

						
						//	System.out.println(n+" "+p+" "+e+" "+c+" "+con+" "+add);
							int i=ps.executeUpdate(); 
							
							System.out.println("hey");
							if(i>0)  {
							 f=true;
							}
							
						          
							}catch (Exception e2) {System.out.println(e2);}
						
		
		return f;
		
	}


public boolean addDoctor(DoctorDetails us) {
	
	boolean f=false;
	try {
		PreparedStatement ps=conn.prepareStatement(  
				"insert into doctor(name,DOB,Qualification,Specialist,email,mobile,password) values(?,?,?,?,?,?,?)");  
		
		
		ps.setString(1,us.getDoc_name());
		ps.setString(2, us.getDOB());
		ps.setString(3,us.getQualification());
		ps.setString(4, us.getSpecialist());
		ps.setString(5, us.getDoc_email());
		ps.setInt(6, us.getDoc_mobile());
	    ps.setString(7, us.getDoc_password());
	    
	    int i=ps.executeUpdate();
	  //  System.out.println("hey");
	  
	    	if(i>0)  {
				 f=true;
				}
				
	}
						
					
	catch (Exception e2) {System.out.println(e2);
	}
	
					
	
	return f;
	
	}


public List<DoctorDetails> getDoctor(int id){
	
	List<DoctorDetails>list=new ArrayList<>();
	
	DoctorDetails ad=null;
	try {
		PreparedStatement ps=conn.prepareStatement(  
				"select * from Addnote where userID=? order by questionID DESC");
		ps.setInt(1, id);
		ResultSet j=ps.executeQuery();
		
		while(j.next()) {
			ad=new DoctorDetails();
			ad.setId(j.getInt(1));
			ad.setDoc_name(j.getString(2));
			ad.setDOB(j.getString(3));
			ad.setQualification(j.getString(4));
			ad.setSpecialist(j.getString(5));
			ad.setDoc_email(j.getString(6));
			
			ad.setDoc_mobile(j.getInt(7));
			ad.setDoc_password(j.getString(8));
			list.add(ad);
			System.out.println(list);
			
		}
	
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	

return list;

	
}


public boolean login(String email,String password) {
	
	boolean f=false;
	try {
		
		 PreparedStatement ps = conn.prepareStatement(
				    "SELECT * FROM doctor WHERE email=? AND password=?");
 
		
		
		ps.setString(1,email);  
		ps.setString(2,password);  
		      
		ResultSet rs=ps.executeQuery();  
		
		
		if(rs.next()) {
			 System.out.println("doing");
	       f=true;				
	
						
		}	
	}
	catch (Exception e2) {System.out.println(e2);
	}
	
					
	
	return f;
	
	}











}
