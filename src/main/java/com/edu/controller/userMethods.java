package com.edu.controller;

import java.sql.SQLException;

public interface userMethods {
	
	public void registration();
	
	public void login() throws SQLException;
	
	public void editProfile();
	
	public void ListUser();
	

}
