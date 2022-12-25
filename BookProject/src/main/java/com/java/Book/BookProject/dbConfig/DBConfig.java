package com.java.Book.BookProject.dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static Connection makeConnection() throws SQLException
	 {
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb", "root", "root");
	 }
}
 	