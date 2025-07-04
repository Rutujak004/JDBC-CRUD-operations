package com.info.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDatabook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load class
				Class.forName("com.mysql.cj.jdbc.Driver");

				//create connection
				Connection con=DBConnection.getconnection();
				
				//Query
				String Query="Select * from book";
				Statement stmt=con.createStatement();
				ResultSet re=stmt.executeQuery(Query);
				
				System.out.println("book_id\tbook_name\tbook_autherName\tbook_price\tbook_pages");
				
				while(re.next()) {
					int book_id=re.getInt("book_id");
					String book_name=re.getString("book_name");
					String book_autherName=re.getString("book_autherName");
					float book_price=re.getFloat("book_price");
					int book_pages=re.getInt("book_pages");
					System.out.println(book_id+"\t"+book_name+"\t"+book_autherName+"\t"+book_price+"\t"+book_pages);
				}
				

	}

}
