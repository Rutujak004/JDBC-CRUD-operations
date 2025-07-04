package com.info.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
        //load class 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection con = DBConnection.getconnection();
		
		//Update Query
		String updateQuery="Update Book Set Book_name = ? where book_id=1";
		PreparedStatement psupdate = con.prepareStatement(updateQuery);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name of book :-");
		String Book_name = sc.next();
		psupdate.setString(1, Book_name);
		psupdate.executeUpdate();
		System.out.println("Sucussfully Updated");
		
		psupdate.close();
		con.close();
		
		
	}

}
