package com.edu.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.edu.controller.*;

public class WelcomePage {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		UserMain userObj = new UserMain();
		Scanner sc = new Scanner(System.in);
		String userInput ="";
		System.out.println("Welcome to Amazon");
		do {
			System.out.println("Please Register or Login YourSelf");
			System.out.println("1. Register user");
			System.out.println("2. Login User");
			System.out.println("Enter your Input");
			int input = sc.nextInt(); //exception if user enter string
			switch(input) {
			case 1: 
				System.out.println("Registration Page....................");
				userObj.registration();
				break;
			case 2: 
				System.out.println("Login Page....................");
				userObj.login();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Do you want to continue or not");
			userInput = sc.next().toLowerCase();
		}while(userInput.equals("yes"));
		System.out.println("Thank you");

	}

}
