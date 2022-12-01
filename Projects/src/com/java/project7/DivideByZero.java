package com.java.project7;

import java.util.Scanner;

public class DivideByZero {
	public static void divideByZero()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		int result = num1/num2;
		if(num2 == 0)
		{
			throw new ArithmeticException("This is an Arithmatic exception.");
		}
		else
		{
			System.out.println("The result is " + result);
			
		}
	}

	public static void main(String[] args) {
		divideByZero();
	}

}
