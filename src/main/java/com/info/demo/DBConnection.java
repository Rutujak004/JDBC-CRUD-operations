package com.info.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getconnection() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/BookInfo";
		String username="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url,password,username);
		
		return con;
		
	}
}
