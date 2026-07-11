package com.java.inheritance;

public class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(String accountNumber, String customerName, double balance, double overdraftLimit) {
		super(accountNumber, customerName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= this.balance + overdraftLimit) {
			System.out.println(
					"Withdrawal amount is allowed as it it is less than or equal to balance amount+overdraft limit");
			this.balance -= amount;
		} else {
			System.out.println("withdraw is not  possible");
		}
	}

}
