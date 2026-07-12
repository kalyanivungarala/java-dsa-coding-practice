package com.java.polymorphism;

import com.java.inheritance.Account;
import com.java.inheritance.CurrentAccount;
import com.java.inheritance.SavingsAccount;

public class BankReport {

	public static void main(String[] args) {
		Account[] accounts = new Account[4];
		accounts[0] = new SavingsAccount("1", "Kalyani", 500000, 9);
		accounts[1] = new SavingsAccount("2", "Srinivas", 100000, 5);
		accounts[2] = new CurrentAccount("3", "Tulasi", 500000, 200);
		accounts[3] = new CurrentAccount("4", "Bhargav", 40000, 500);

		for (Account account : accounts) {
			if (account instanceof SavingsAccount) {
				System.out.println(" --- Savings account detected --- ");
			}
			if (account instanceof CurrentAccount) {
				System.out.println("--- Current account detected --- ");
			}

			account.displayAccountDetails();
		}

	}

}
