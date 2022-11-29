package com.java.project6;

import java.util.Scanner;

public class Account {
	private double balance;
	private double amt;
	 public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	void amtDeposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		balance = sc.nextDouble();
	}
	void amtWithdraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to Withdraw");
		amt = sc.nextDouble();
	}
	void display() throws UserDefinedException
	{
		double amount = balance - amt;
		if(amount > amt)
		{
			throw new UserDefinedException("Insufficient balance");
		}
		else if(amount < amt)
		{
			System.out.println("Amount deposit success");
		}
		else
		{
			System.out.println("Amount withdraw success");
		}
	}
	

}
