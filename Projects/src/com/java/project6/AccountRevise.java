package com.java.project6;

import java.util.Scanner;

public class AccountRevise  {
	private double balance = 1000; ;
	private double amount;

	public AccountRevise(double balance, double amount) {
		super();
		this.balance = balance;
		this.amount = amount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	void depositAmount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println(balance);
	}
	void withdrawAmount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
		amount = sc.nextDouble();
		
		if(amount > balance)		
		{
			try
			{
			throw new NotSufficientFundException("Not sufficient balance"); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			balance = balance - amount;
			System.out.println(balance);
		}
		//balance = balance + amount;
	}

}
