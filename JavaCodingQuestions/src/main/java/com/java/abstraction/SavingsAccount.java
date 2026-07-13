package com.java.abstraction;

public class SavingsAccount extends Account {
	
	public SavingsAccount(String accountNumber, String accountName, double balance) {
		super( accountNumber, accountName, balance);
	}

	@Override
	public void calculateCharges() {
		System.out.println("No charges for savings account");
	}

}
