package com.java.Book.BookProject.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.java.Book.BookProject.daoImplementation.BookDaoImplementation;
import com.java.Book.BookProject.dbConfig.DBConfig;
import com.java.Book.BookProject.entity.Book;

public class BookMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	
	{
		BookDaoImplementation bdo = new BookDaoImplementation();
		Book b = new Book();
		System.out.println(b.toString());
		DBConfig db = new DBConfig();
		db.makeConnection();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("1: Insert the record");
		System.out.println("2: Update the record");
		System.out.println("3: delete the record");	
		System.out.println("4: Display All");
		System.out.println("5: search the record based on Price");
		//System.out.println("6: Exit");
		int choice;
		while(true)
		{
			System.out.println("Make a choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Insert the book id");
				int bookId = Integer.parseInt(br.readLine());
				System.out.println("enter the book name");
				String bookName = br.readLine() ;
				System.out.println("enter the book author");
				String author = br.readLine() ;
				System.out.println("enter the book description");
				String description = br.readLine() ;
				System.out.println("enter the book Url");
				String bookUrl = br.readLine() ;
				System.out.println("enter the book price");
				double price =Double.parseDouble(br.readLine());
				bdo.insertRecord(bookId, bookName, author, description,bookUrl,price);
				System.out.println("Insserted Successfully");
				break;
			case 2:
				System.out.println("Enter the BookId to update the record");
				bookId = Integer.parseInt(br.readLine());
				System.out.println("enter the New book name");
				 bookName = br.readLine() ;
				System.out.println("enter the New book author");
				 author = br.readLine() ;
				System.out.println("enter the New book description");
				 description = br.readLine() ;
				System.out.println("enter the New book Url");
				 bookUrl = br.readLine() ;
				System.out.println("enter the book price");
				 price =Double.parseDouble(br.readLine());
				bdo.updateRecord(bookId,bookName,author,description,bookUrl,price);
				System.out.println("Data updated successfully");
				break;
			case 3:
				System.out.println("Enter the Book Id to delete");
				bookId = Integer.parseInt(br.readLine());
				bdo.deleteRecord(bookId);
				System.out.println("Record deleted successfully!");
				break;
			case 4:
				bdo.displayAll();
				break;
			case 5:
				System.out.println("Enter the price of book to be searched");
				  price =Double.parseDouble(br.readLine());
				 bdo.searchRecordByItsPrice(price);
			}
				
			
		}
////		bdo.createTable();
//		bdo.insertRecoord();

	}

}
