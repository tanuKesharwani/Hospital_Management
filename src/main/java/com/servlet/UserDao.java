package com.servlet;


import java.sql.Connection;
import java.sql.PreparedStatement;




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
}
