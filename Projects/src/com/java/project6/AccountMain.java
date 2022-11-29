package com.java.project6;

import com.java.project5.ProductLogic;

public class AccountMain {

	public static void main(String[] args) {
		Account a = new Account();
		try {
			a.amtDeposit();
			a.amtWithdraw();
			a.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
