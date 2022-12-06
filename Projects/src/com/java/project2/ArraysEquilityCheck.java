package com.java.project2;

import java.util.Scanner;

public class ArraysEquilityCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 1st array");
		int num1 = sc.nextInt();
		System.out.println("Enter the elements of 2st array");
		int num2 = sc.nextInt();
		int arr1[] = new int[num1];
		int arr2[] = new int[num2];
		System.out.println("Enter the elements of 1st array");
		for(int i=0; i<num1; i++)
		{
			arr1[i]  = sc.nextInt();
		}
		
		//int arr2[] = new int[num2];
		
		//for inputting data
		/*System.out.println("Enter the elements of 1st array");*/
		System.out.println("Enter the elements of 2nd array");
		for(int j=0; j<num2; j++)
		{
			arr2[j]  = sc.nextInt();
		}
		//System.out.println("Enter the elements of 2st array");
		/*System.out.println("Enter the elements of array");
		for(int i=0; i<=num2; i++)
		{
			arr2[i]  = sc.nextInt();
		}*/
		//for displaying
		System.out.println("Array elemets are:");
		for(int i=0; i<num1;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Array elemets are:");
		for(int j=0; j<num2;j++)
		{
			System.out.println(arr2[j]);
		}
	}

}
