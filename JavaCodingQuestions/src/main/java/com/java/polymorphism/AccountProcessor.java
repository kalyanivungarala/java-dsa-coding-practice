package com.java.polymorphism;

import com.java.inheritance.Account;
import com.java.inheritance.CurrentAccount;
import com.java.inheritance.SavingsAccount;

public class AccountProcessor {

	public static void main(String[] args) {

		Account savingsAccount = new SavingsAccount("456", "Ram", 5000, 10);
		Account currentAccount = new CurrentAccount("4567", "Bhargav", 9000, 12);

		processAccount(savingsAccount);
		processAccount(currentAccount);

	}

	public static void processAccount(Account account) {
		System.out.println("Processing account ....");
		account.displayAccountDetails();
	}

}
