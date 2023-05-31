package com.edu.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.edu.controller.CustomerOperation;
import com.edu.model.DatabseConnection;
import com.mysql.cj.protocol.Resultset;

public class CustomerPage {

	static Connection conn=null;
	Statement st = null;
	ResultSet rs = null;
	 static {
	    	DatabseConnection dc = new DatabseConnection();
	        try {
	            conn = dc.connection();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	String userContinue = "";
	Scanner sc = new Scanner(System.in);
	
	public void CustomerMenu(String UserName , int id) {
		// TODO Auto-generated method stub
		int LoggedUserId = id;
		System.out.println("Hello "+ UserName +" what operation do you want to perform ");
		do {
			System.out.println("1. Edit Profile");
			System.out.println("2. View Profile");
			System.out.println("3. View Product");
			System.out.println("4. Buy Product");
			System.out.println("5. Logout");
			int input = sc.nextInt();
			CustomerOperation cusope = new CustomerOperation();
			switch(input) {
				case 1:
					cusope.CustomerEditProfile(LoggedUserId);
					break;
				case 2:
					cusope.CustomerEditProfile(LoggedUserId);
					break;
				case 3:
					cusope.CustomerViewProduct();
					break;
				case 4:
					cusope.CustomerViewProduct();
					break;
				case 5:
					System.out.println("Visit Again...");
					userContinue="no";
					break;
				}
			
			if(userContinue!="no") {
				System.out.println(" You want to perform other operation");
				userContinue = sc.next().toLowerCase();
			}
		}while(userContinue.equals("yes"));
	}

}
