package com.java.project1;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find cube");
		int num = sc.nextInt();
		//int i = 0;
		for(int i=1; i<=num; i++)
		{
			System.out.println( "Number is " + i +  " and Cube of "+ i + " is "  + i*i*i);
		}

	}

}
