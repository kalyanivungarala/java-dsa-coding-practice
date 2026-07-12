package com.java.polymorphism;

import com.java.inheritance.Account;
import com.java.inheritance.CurrentAccount;
import com.java.inheritance.SavingsAccount;

public class BankApplication {
	public static void main(String[] args) {
		Account savingsAccount = new SavingsAccount("FIN1001", "Kalyani", 10000, 5);
		Account currentAccount = new CurrentAccount("FIN1002", "Rohit", 10000, 5000);

		savingsAccount.withdraw(2000);
		currentAccount.withdraw(12000);

		savingsAccount.displayAccountDetails();
		currentAccount.displayAccountDetails();
		System.out.println(savingsAccount instanceof SavingsAccount);
		System.out.println(currentAccount instanceof CurrentAccount);
		System.out.println(savingsAccount instanceof Account);
	}
}
