package com.DB;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn;
   public static Connection getConn() {
	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			 conn=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/hospital","root","Tanu#110302");  
	
		   
	   }
	   
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   
	   
	return conn;
	   
	   
   }
public static Connection getConn1() {
	// TODO Auto-generated method stub
	return null;
}
}

