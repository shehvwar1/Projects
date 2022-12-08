package com.java.project7;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import java.util.*;

public class BookStoreMainExample {
//	static void display(BookStoreExample bse)
//	{
//		System.out.println("Title of book is  " + bse.getbTitle());
//		System.out.println("Price of Book is " + bse.getPrice());
//		System.out.println("Year of publication " + bse.getYop());
//		System.out.println("Author of book is " + bse.getAur());
//	}

	public static void main(String[] args) {
		
//		BookStoreExample b1 = new BookStoreExample("StoryBooks",99,"12-02-22", new AuthorExample("Subuhi"));
//	//BookStoreExample b = new BookStoreExample(bTitle:"StoryBook", YOP:);
//		display(b1);
		Collection<BookStoreExample> c = new ArrayList<BookStoreExample>();
		int choice;
		Scanner sc = new Scanner(System.in);
		//Taking user input
		System.out.println("1: Add Book");
		System.out.println("2: Display All Books");
		System.out.println("3: Search By Book title");
		System.out.println("4: Search By Author");
		System.out.println("5: Exit");
		while(true)
		{
			System.out.println("-------------------------------------------------");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				//adding a book
				System.out.print("Enter the Book Tile ");
				String bTitle = sc.next();
				System.out.print("Enter the Book price ");
				int price = sc.nextInt();
				System.out.print("Enter the year Of publication ");
				String yop = sc.next();
				System.out.print("Enter the Book author ");
				String aur = sc.next();
				c.add(new BookStoreExample(bTitle , price , yop , new AuthorExample(aur)));
				break;
			case 2:
				//displaying all books
				System.out.println("---------------------------------------------------");	
				//Iterator
				Iterator<BookStoreExample> i = c.iterator();
				while(i.hasNext())
				{
					BookStoreExample bse = i.next();
					System.out.println(bse);
				}
				System.out.println("---------------------------------------------------");
				break;
			case 3:
				//search by title of the book
				boolean found = false;
				System.out.println("Enter the title of book to be searched");
				String bkTitle = sc.next();
				System.out.println("---------------------------------------------------");
				 i = c.iterator();
				while(i.hasNext())
				{
					BookStoreExample bse = i.next();
					if(bse.getbTitle().equalsIgnoreCase(bkTitle))
					{
						System.out.println(bse);
						found = true;
					}
				}
				
				if(!found)
				{
					System.out.println("currently book is not available");
				}
				System.out.println("--------------------------");
				break;
			case 4:
				//search by author
				boolean found1 = false;
				System.out.println("Enter the author of book to be searched");
				String baur = sc.next();
				System.out.println("---------------------------------------------------");
				 i = c.iterator();
				while(i.hasNext())
				{
					BookStoreExample bse = i.next();
					AuthorExample ae = new AuthorExample();
					if((bse.getAur().getaName()).equals(baur))
					{
						System.out.println(bse);
						found1 = true;
					}
				}
				
				if(!found1)
				{
					System.out.println("currently book is not available");
				}
				System.out.println("--------------------------");
				
				break;
			case 5:
				//exit
				break;
			default:
				System.out.println("Invalid option");
			}
		}
		
		

	}

}
