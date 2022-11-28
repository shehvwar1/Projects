package com.java.project2;

import java.util.Scanner;

public class ArrayTranspose {
	public static void arrayTranspose()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of row");
		int row = sc.nextInt();
		System.out.println("enter sixe of column");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Array matrix is");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		//System.out.println("the matrix is");
		System.out.println("Array matrix is");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j] + "\s");
			}
			System.out.println();
		}
		//Transpose of matrix
		System.out.println("Transpose of matrix is");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[j][i] + "\s");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		arrayTranspose();
	}

}
