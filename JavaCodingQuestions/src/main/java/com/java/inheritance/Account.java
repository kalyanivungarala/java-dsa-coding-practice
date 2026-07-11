package com.java.inheritance;

public class Account {

	private String accountNumber;
	private String customerName;
	protected double balance;

	public Account(String accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Amount should be greater than 0 to deposit");
			return;
		} else {
			this.balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Amount should be greater than 0 to withdraw");
			return;
		}
		if (amount > this.balance) {
			System.out.println("Insufficient balance");
			return;
		}
		this.balance -= amount;
	}

	public void displayAccountDetails() {
		System.out.println("***********Account Details ***********");
		System.out.println("Cusomer Name : " + this.customerName);
		System.out.println("Account Number : " + this.accountNumber);
		System.out.println("Account Balance : " + this.balance);
	}
	
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("1029384756","M.BHARGAV RAM",1000, 5);
		savingsAccount.deposit(5000);
		savingsAccount.withdraw(2000);
		savingsAccount.displayAccountDetails();
		savingsAccount.addInterest();
		savingsAccount.displayAccountDetails();
		
	}
}
