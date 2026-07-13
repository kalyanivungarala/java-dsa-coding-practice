package com.java.polymorphism;

import com.java.inheritance.Account;
import com.java.inheritance.SavingsAccount;

public class DowncastingDemo {

	public static void main(String[] args) {
		Account account = new SavingsAccount("5678", "Lakshmi", 1000000, 9);
		if (account instanceof SavingsAccount) {
			SavingsAccount savingsAccount = (SavingsAccount) account;
			savingsAccount.addInterest();
			savingsAccount.displayAccountDetails();
		}
	}
}
