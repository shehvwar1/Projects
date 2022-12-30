package com.java.studentMngmt.StudentMngmt;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("1: Insert the recoed");
		System.out.println("2: Display all");
		System.out.println("3: Update the record");
		System.out.println("4: Delete the record");
		System.out.println("5: Exit");
		 while(true)
		 {
			 System.out.println("Make a choice:");
			 choice = sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Insertion");
				 s.insertRecord();
				 Transaction ts =  session.beginTransaction();
				 session.save(s);
				 ts.commit();				 
				 System.out.println("Record inserted successfully");
				 break;
			 case 2:
			 System.out.println("Display All ");
			 ts =  session.beginTransaction();
			 List stdList = session.createQuery("From Student").list();
			 for(Iterator itr = stdList.iterator();itr.hasNext();) {
			   s = (Student) itr.next();
			   System.out.println("Student id is " + s.getSId() + "\t" + " Student name is " + s.getSName() + "\t" + " Student Grade is " + s.getGrades() + "\t	"  +" student contact number is " + s.getContactNo());
			 }
			 ts.commit();				 
			 break;
			 case 3:
				 System.out.println("Enter the Id to update the record");
				 int sId = sc.nextInt();
				 System.out.println("Enter the new Student Name");
				 String sName = sc.next();
				 System.out.println("Enter the new Grades");
				 double grades = sc.nextDouble();
				 System.out.println("Enter the new Contact Number");
				 int contactNumb = sc.nextInt();
				 ts = session.beginTransaction();
				 s = session.get(Student.class, sId);
				 s.setSName(sName);
				 s.setGrades(grades);
				 s.setContactNo(contactNumb);
				 session.update(s);
				 ts.commit();
				 System.out.println("Records Updated successfully!!");
				 //Updattion code goes here
				 break;
			 case 4:
				 System.out.println("Enter the id to delete the record");
				 sId = sc.nextInt();
				 ts = session.beginTransaction();
				 s = session.get(Student.class, sId);
				 session.delete(s);
				 ts.commit();
				 System.out.println("Record deleted successfully");
				 //deletion code goes here
				 break;
			 case 5:
				 System.out.println("You are exited");
				 break;
			 }
		 }
		 	
	}

}
