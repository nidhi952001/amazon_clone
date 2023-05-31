package com.edu.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.edu.model.DatabseConnection;

public class CustomerOperation {

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
	
	Scanner sc = new Scanner(System.in);
	
	public void CustomerEditProfile(int id) {
		// TODO Auto-generated method stub
		int LoggedId = id;
		boolean val= false;
		try {
			st = conn.createStatement();
			String sqlSelect = "select * from registration where userId='"+LoggedId+"'";
			rs =st.executeQuery(sqlSelect);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rs!=null) { //if id is exist..logged in user details fetch successfully
			rs=null;
			System.out.println("What do you want to Edit");
			System.out.println("1. Name");
			System.out.println("2. Email");
			System.out.println("3. Password");
			System.out.println("Enter Number");
			int num = sc.nextInt();
			if(num==1) {
				System.out.println("Enter new Name");
				Scanner scanner = new Scanner(System.in);
				String newname = scanner.nextLine();
				try {
					st = conn.createStatement();
					String UpdateName = "update registration set Username='"+newname+"' where UserId="+LoggedId+"";
					int vals = st.executeUpdate(UpdateName);
					if(vals>0) {
						System.out.println("your name is updated");
					}
					else {
						System.out.println("Something is wrong Please Try again");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			else if(num==2) {
				System.out.println("Enter new Email");
				String newEmail = sc.nextLine();
				try {
					st = conn.createStatement();
					String UpdateEmail = "update registration set Username='"+newEmail+"' where UserId='"+rs.getInt("UserId")+"'";
					int vals = st.executeUpdate(UpdateEmail);
					if(vals>0) {
						System.out.println("your Email is updated");
					}
					else {
						System.out.println("Something is wrong Please Try again");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if(num==3) {
				System.out.println("Enter new password");
				String newPassword = sc.nextLine();
				try {
					st = conn.createStatement();
					String Updatepassword = "update registration set Username='"+newPassword+"' where UserId='"+rs.getInt("Userid")+"'";
					int vals = st.executeUpdate(Updatepassword);
					if(vals>0) {
						System.out.println("your password is updated");
					}
					else {
						System.out.println("Something is wrong Please Try again");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("You Entered Wrong input");
			}
		}
		else {
			System.out.println("Unavble to fetch data");
		}
	}

	public void CustomerViewProduct() {
		// TODO Auto-generated method stub
		
	}

}
