package com.java.inheritance;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = (super.balance * interestRate) / 100;
		super.balance += interest;
		System.out.println("Interset : " + interest);
	}
}
