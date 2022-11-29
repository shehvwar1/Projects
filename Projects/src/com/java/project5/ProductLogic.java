package com.java.project5;

import java.util.Scanner;

public class ProductLogic {
	
	public void productCheck(int weight) throws Product
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of product");
		weight = sc.nextInt();
		if(weight < 100)
		{
			throw new Product("Product is invalid");
		}
		else
		{
			System.out.println("Weight of the product is " + weight);
		}
	}

}
