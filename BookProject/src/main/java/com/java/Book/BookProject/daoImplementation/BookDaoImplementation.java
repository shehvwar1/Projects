package com.java.Book.BookProject.daoImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.java.Book.BookProject.dao.BookDAO;
import com.java.Book.BookProject.dbConfig.DBConfig;
import com.java.Book.BookProject.entity.Book;
public class BookDaoImplementation implements BookDAO  {
	static Connection conn;
	static PreparedStatement pst;
	ResultSet rs;
	static {
		try {
			conn = DBConfig.makeConnection();
		}catch(Exception e)
		{
			
		}
	}
//	 public void createTable()
//	 {
//		 String query = "create table book(bookId int, bookName varchar(30), author varchar(30), description varchar(100), bookurl varchar(200), price decimal(6,2))";
//		try {
//			pst = conn.prepareStatement(query);
//			int i = pst.executeUpdate();
//			if(i == 0)
//			{
//				System.out.println("Table created successfully");
//			}
//			else
//			{
//				System.out.println("Try again");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	 }
	@Override
	public void insertRecord(int bookId, String bookName, String author, String description,String bookUrl, double price) {

		
		try {
			pst = conn.prepareStatement("insert into book values(?,?,?,?,?,?)");
//		String query = "insert into book values(?,?,?,?,?,?)";
		pst.setInt(1, bookId);
		pst.setString(2, bookName);
		pst.setString(3, author);
		pst.setString(4, description);
		pst.setString(5, bookUrl);
		pst.setDouble(6, price);
		pst.executeUpdate();	

		}
		catch(Exception e)
		{
			
		}
				
		
	}
	public void updateRecord(int bookId, String bookName, String author, String description,String bookUrl, double price)
	{
		try {
			String query = "update book set bookName=?,author=?,description=?,bookUrl=?,price =? where bookId=?";
			pst = conn.prepareStatement(query);
			pst.setInt(6, bookId);
			pst.setString(1, bookName);
			pst.setString(2, author);
			pst.setString(3, description);
			pst.setString(4, bookUrl);
			pst.setDouble(5, price);
			pst.executeUpdate();	
		}catch(Exception e)
		{
			
		}
	}
	@Override
	public void deleteRecord(int bookId) {
		try {
			String query = "delete from book where bookId = ?";
			pst = conn.prepareStatement(query);
			pst.setInt(1, bookId);
			pst.executeUpdate();
			
		}catch(Exception e) {
			
		}
		
	}
	@Override
	public void displayAll() {
		try {
			pst = conn.prepareStatement("select * from book");
			rs = pst.executeQuery();
			while(rs.next())
			{
				String data = rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3)+ "\t"+rs.getString(4)+"\t" +rs.getString(5)+ "\t " +rs.getDouble(6);
				System.out.println(data); 
			}
			
		}catch(Exception e) {}
		
	}
	@Override
	public void searchRecordByItsPrice(double price) {
		boolean found = false;
		try {
			pst = conn.prepareStatement("select * from book where price > ?");
			pst.setDouble(1, price);
			rs = pst.executeQuery();
			while(rs.next())
			{
				String data = rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3)+ "\t"+rs.getString(4)+"\t" +rs.getString(5)+ "\t " +rs.getDouble(6);
				System.out.println(data); 
				found = true;
			if(!found)
			{
				System.out.println("Book doesnot exist");
			}
			}
			
		}catch(Exception e) {}
		
	}
	
}
