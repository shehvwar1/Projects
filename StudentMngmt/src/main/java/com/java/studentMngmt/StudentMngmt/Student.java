package com.java.studentMngmt.StudentMngmt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int sId;
	@Column
 private String sName;
	@Column
 private double grades;
	@Column
 private int contactNo;

	public void insertRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		sName = sc.next();
		System.out.println("Enter the student grades");
		grades = sc.nextDouble();
		System.out.println("Enter student contect number");
		contactNo = sc.nextInt();	
	}
//	public void delete(int sId)
//	{
//		
//	}
}
