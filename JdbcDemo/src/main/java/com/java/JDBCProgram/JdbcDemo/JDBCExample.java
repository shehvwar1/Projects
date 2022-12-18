package com.java.JDBCProgram.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "select * from customers";
		String url = "jdbc:mysql://localhost:3306/store";
		String uName = "root";
		String pswrd = "root";
		Connection conn = DriverManager.getConnection(url,uName,pswrd);
		Statement st = conn.createStatement();	
		ResultSet rs= st.executeQuery(sql);
		while(rs.next())
		{
			String storeData = rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getInt(4)+ " "+ rs.getInt(5);
			System.out.println(storeData);
		}
		System.out.println("---------------------------------------");
		String query = "select * from customers where cname = 'Hoffman' ";
		rs = st.executeQuery(sql);
		
//		String query1 
	}

}
