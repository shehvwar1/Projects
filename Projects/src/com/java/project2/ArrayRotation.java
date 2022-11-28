package com.java.project2;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the elements of array");
		for(int i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		//displayng array elements
		System.out.println("Array elements are");
		for(int i=0; i<num; i++)
		{
			System.out.println(arr[i]);
	    }
		
		//rotating array cloclwise
		System.out.println("Array rotation:");
		for(int i=num-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}

	}

}
