package com.edu.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabseConnection {
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/amazon_clone";
	String uname = "root";
	String pass ="root";
	Connection Conn = null;
	Statement st=null;
	ResultSet rs = null;
	
	public Connection connection() throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		
		Conn = DriverManager.getConnection(url,uname,pass);
		
		return Conn;
	}

}
