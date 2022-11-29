package com.java.project5;

public class ProductMain {

	public static void main(String[] args) {
		ProductLogic pl = new ProductLogic();
		try {
			pl.productCheck(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
