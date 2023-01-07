package com.java.Lib.lib.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Lib.lib.dao.BookDao;
import com.java.Lib.lib.dao.LibraryDao;
import com.java.Lib.lib.entity.Book;
import com.java.Lib.lib.entity.Library;



public class LibraryMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		Book b = new Book();
		Library library = new Library();
		BookDao bdo = (BookDao) ctx.getBean("bookdao");
		LibraryDao libdao = (LibraryDao) ctx.getBean("librarydao");
		int choice;
		Scanner sc = new Scanner(System.in);
		//int row = sc.nextInt();
		System.out.println("Insert the records");
		System.out.println("Enter the staff name");
		String staffName = sc.next();
		System.out.println("enter the no of books you want to insert");
		
			System.out.println("Ente the Book Name");
			String bName = sc.next();
			b.setbName(bName);	
			b.setLibrary(library);
		library.setStaffName(staffName);
		
		libdao.insertLib(library);
		bdo.insertRecord(b);
//		System.out.println("1: Insert required Records");
//		System.out.println("2: Insert Record in Book");
//		while(true)
//		{
//			System.out.println("Make your choice");
//			choice = sc.nextInt();
//			switch(choice) 
//			{
//			case 1:
////				System.out.println("Enter Staff Id");
////				int staffId = sc.nextInt();
////				System.out.println("Enter Staff Name");
////				String staffName = sc.next();
////				System.out.println("Enter Staff Designation");
////				String designation = sc.next();
////				lib.setStaffId(staffId);
////				lib.setStaffName(staffName);
////				lib.setDesignation(designation);	
////				System.out.println("Enter the number of books to be inserted");
//////				int rows = sc.nextInt();
//////				for(int i=1 ;i<=rows; i++)
//////				{
//////					
////			//	}
////				System.out.println("Enter Book Name");
////				String bookName = sc.next();
////				System.out.println("ENter author name");
////				String author = sc.next();
////				b.setBookName(bookName);
////				//lib.setBook(b);
//////				lib.setBook(book);
////				lid.insertLibRecord(lib);
////				lid.insertBook(b);
//////				libdao.insertLibDetails(lib);
////				System.out.println("Inserted Suffessfully");
//				break;
//			case 2:
//				System.out.println("Enter the no of books to be inserted");
//				int row = sc.nextInt();
//				for(int i=0; i<row; i++)
//				{
//					System.out.println("Enter Book Name");
//					String bName = sc.next();
////					System.out.println("Enter author Name");
////					String author = sc.next();
//					b.setbName(bName);
////					b.setAuthor(author);
////					book.add(b);
//					bdo.insertRecord(b);
////					lib.setBook(book);
//					System.out.println("Inserted Successfully");
//					
//				}
////				System.out.println("Enter Book Name");
////				String bName = sc.next();
//////				System.out.println("Enter author Name");
//////				String author = sc.next();
////				b.setbName(bName);
//////				b.setAuthor(author);
//////				book.add(b);
////				bdo.insertRecord(b);
//////				lib.setBook(book);
////				System.out.println("Inserted Successfully");
////				break;
//			}
//		}
		

	
	}

}
