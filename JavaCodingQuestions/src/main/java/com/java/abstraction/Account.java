package com.java.abstraction;

public abstract class Account {

	String accountNumber;
	String accountName;
	double balance;

	public Account(String accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount should be grater than zero");
			return;
		}

		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount should be grater than zero");
			return;
		}
		
		if (this.balance < amount) {
			System.out.println("Insufficent balance");
			return;
		}

		this.balance -= amount;

	}

	public void displayAccountDetails() {
		System.out.println("******* Account Details *********");
		System.out.println("Cusomer Number " + accountNumber);
		System.out.println("Cusomer Name " + accountName);
		System.out.println("Account balace " + balance);
	}

	public abstract void calculateCharges();
	
	
	public static void main(String[] args) {
		Account account =  new SavingsAccount("124", "Kalyani", 4000);
		account.deposit(2000);
		account.withdraw(1000);
		account.displayAccountDetails();
		account.calculateCharges();
		
		Account currentAccount = new CurrentAccount("456", "Bhargav", 10000);
		currentAccount.deposit(4000);
		currentAccount.withdraw(100);
		currentAccount.displayAccountDetails();
		currentAccount.calculateCharges();
	}

}
