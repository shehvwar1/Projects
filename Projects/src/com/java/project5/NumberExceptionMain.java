package com.java.project5;

public class NumberExceptionMain {

	public static void main(String[] args) {
		NumberExceptionLogic nel = new NumberExceptionLogic();
		try {
			nel.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
