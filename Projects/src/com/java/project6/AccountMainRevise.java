package com.java.project6;

import java.util.Scanner;

public class AccountMainRevise {

	public static void main(String[] args) {
		Account ac = new Account();
		AccountRevise ar = new AccountRevise(1000, 0);
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Know your Balance");
		System.out.println("2: deposit");
		System.out.println("3: Withdraw");
		System.out.println("4: Exit");
		while(true)
		{
			System.out.println("Select one option: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Your available balance is " + ar.getBalance());
				break;
			case 2: 
				System.out.println("The amount deposited is ");
				ar.depositAmount();
				break;
				//System.out.println("The deposited amount is " + ar.depositAmount() );
			case 3: 
				System.out.println("The amount Withdrawn is ");
				ar.withdrawAmount();
				break;
			/*case 4:
				System.out.println("Make ");
				break;*/
				default:
					System.out.println("Invalid option");
					
			}
		}

	}

}

