package com.java.project8;

public class EvenThread extends Thread{
	public void run() {
		for(int i=0; i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers are " + i);
			}
		}
		System.out.println("**********************************");
	}
	
}
