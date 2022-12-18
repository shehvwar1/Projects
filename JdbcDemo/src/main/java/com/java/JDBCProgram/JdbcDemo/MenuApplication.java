package com.java.JDBCProgram.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuApplication {
//	int id;
//	String ufirstName;
//	String uLastName;
	
	Connection conn;
	String url ="jdbc:mysql://localhost:3306/usermenu";
	String userName = "root";
	String pswrd = "root";
	Statement st;
	ResultSet rs;
	 MenuApplication() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,userName,pswrd);
//		Statement st = conn.createStatement();
	}
	 public void insertion() throws SQLException
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id");
		 int id = sc.nextInt();
		 System.out.println("Enter the user first name");
		 String ufirstName = sc.next();
		 System.out.println("Entere the user last name");
		 String uLastName = sc.next();
		 st = conn.createStatement(); 
		 st.executeUpdate("insert into userdata value('"+id+"','"+ufirstName+"','"+uLastName+"')");
		 System.out.println("values inserted successfully");
	 }
	 public void updation(int id, String ufirstName, String uLastName) throws SQLException
	 {
		 st = conn.createStatement();
		 st.executeUpdate("update userdata set id = '"+id+"', ufirstName='"+ufirstName+"', uLastName = '"+uLastName+"' where id = '"+id+"' ");
		 System.out.println("Updated successfully!!");
				 
	 }
	 public void display() throws SQLException
	 {
		 String query = "select * from userdata";
		  st = conn.createStatement();	
		  rs= st.executeQuery(query);
			while(rs.next())
			{
				String storeData = rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3);
				System.out.println(storeData);
			}
	 }
	 public void search(int id) throws SQLException
	 {
		 String query = "select * from userdata where id = '"+id+"'";
		  st = conn.createStatement();	
		  rs= st.executeQuery(query);
		  if(rs.next())
		  {
			  System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3));
		  }
		  else
		  {
			  System.out.println("Record not found");
		  }
//			while(rs.next())
//			{
//				String storeData = rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3);
//				System.out.println(storeData);
//			}
	 }
	 public void delete(int id) throws SQLException
	 {
		 String query = "delete from userdata where id = '"+id+"'";
		 st = conn.createStatement();
		 st.executeUpdate(query);
		 System.out.println("Record deleted successfully!!");
	 }
	 void close() throws SQLException
	 {
		 conn.close();
	 }
	
}