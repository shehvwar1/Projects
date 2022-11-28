package com.java.project5;

import java.util.Scanner;

public class NumberExceptionLogic {
	
	public void display() throws NumberException { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num < 10 || num > 50)
		{
			throw new NumberException("number out of range exception.");
		}
		else
		{
			System.out.println(num*num);
		}
	}
}
