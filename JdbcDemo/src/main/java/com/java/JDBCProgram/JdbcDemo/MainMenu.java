package com.java.JDBCProgram.JdbcDemo;
import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		 MenuApplication mnu = new MenuApplication();
		 InputStreamReader ir = new InputStreamReader(System.in);
		 BufferedReader brd = new BufferedReader(ir);
		 System.out.println("1: Insert to database");
		 System.out.println("2: display all");
		 System.out.println("3: Search A record");
		 System.out.println("4: Update a record");
		 System.out.println("5: Delete a record");
	 int choice;
	 while(true)
	 {
		 System.out.println("make your choice");
		 choice = Integer.parseInt(brd.readLine()); 
//		 choice = ir.read();
		 switch(choice)
		 {
		 case 1:
			 mnu.insertion();
			 break;
		 case 2:
			 mnu.display();
			 break;
		 case 3:
			 System.out.println("Enter id");
			 int id = Integer.parseInt(brd.readLine());
			 mnu.search(id);
			break;
		 case 4:
			 System.out.println("Enter the id to be update");
			  id = Integer.parseInt(brd.readLine());
			  System.out.println("Enter the first name to b update");
			  String ufirstName = brd.readLine();
			  System.out.println("Enter last name to be update");
			  String uLastName = brd.readLine();
			 mnu.updation(id, ufirstName, uLastName);
			 break;
		 case 5:
			 System.out.println("Enter id");
			 id = Integer.parseInt(brd.readLine());
			 mnu.delete(id);
			 break;
			default:
				System.out.println("Enter a valid choice");
		 }
		 
	 }

	}

}
