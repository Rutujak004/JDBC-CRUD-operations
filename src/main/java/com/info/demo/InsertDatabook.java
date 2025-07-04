package com.info.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDatabook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//load class
		Class.forName("com.mysql.cj.jdbc.Driver");

		//create connection
		Connection con=DBConnection.getconnection();
		
		//Query
		String insertQuery="insert into book(book_id,book_name,book_autherName,book_price, book_pages) values(?,?,?,?,?)";
		PreparedStatement psinsert=con.prepareStatement(insertQuery);
		Scanner sc=new Scanner(System.in);
		
	
			System.out.print("Enter Book ID:=");
			psinsert.setInt(1,sc.nextInt());
			System.out.println("Enter the Book Name:=");
			psinsert.setString(2, sc.next());
			System.out.println("Enter the Book Auther Name:=");
			psinsert.setString(3, sc.next());
			System.out.print("Enter Book Price:=");
			psinsert.setFloat(4,sc.nextFloat());
			System.out.print("Enter Book pages:=");
			psinsert.setInt(5,sc.nextInt());
			
			psinsert.executeUpdate();
			System.out.print("Sucssesfully insert the data.!");
		
	
		con.close();
	}

}
