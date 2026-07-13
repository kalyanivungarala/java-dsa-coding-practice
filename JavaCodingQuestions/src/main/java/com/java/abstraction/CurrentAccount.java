package com.java.abstraction;

public class CurrentAccount extends Account {
	
	public CurrentAccount(String accountNumber, String accountName, double balance) {
		super(accountNumber, accountName, balance);
	}

	@Override
	public void calculateCharges() {
		System.out.println(" Current account maintenance charges : 500");
	}
}
