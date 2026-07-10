package com.java.oops;

public class CustomerEncapsulation {
	private String customerName;
	private int customerAge;
	private String accountNumber;
	private double accountBalance;

	public CustomerEncapsulation(String customerName, int customerAge, String accountNumber, double accountBalance) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	void displayCustomerDetails() {
		System.out.println("Customer Details : ");
		System.out.println("Customer Name : " + customerName);
		System.out.println("Customer Age : " + customerAge);
		System.out.println("Customer Account Number : " + accountNumber);
		System.out.println("Customer Account Balance : " + accountBalance);

	}

	void deposit(double amount) {
		if(amount > 0) {
		this.accountBalance += amount;
		}else {
			System.out.println("Deposit amount must be grater than 0");
		}

	}

	void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("amount must be grater than 0");
			return;
		}
		if (amount > this.accountBalance){
			System.out.println("Insufficient balance");
			return;
		}
		this.accountBalance -= amount;
		

	}

	double checkBalance() {
		return this.accountBalance;
	}

	public static void main(String[] args) {
		CustomerEncapsulation customer1 = new CustomerEncapsulation("Kalyani", 30, "FIN1001", 50000);
		CustomerEncapsulation customer2 = new CustomerEncapsulation("Rohit", 30, "FIN1002", 25000);
		customer1.displayCustomerDetails();
		customer2.displayCustomerDetails();
		customer1.deposit(5000);
		customer2.deposit(5000);
		customer1.withdraw(2000);
		customer2.withdraw(2000);
		System.out.println("Customer1 Final Account Balance : " + customer1.checkBalance());
		System.out.println("Customer2 Final Account Balance : " + customer2.checkBalance());
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setCustomerAge(int customerAge) {
		if (customerAge >= 18) {
			this.customerAge = customerAge;
		} else {
			System.out.println("Customer age should be grater than or equal to 18");
		}
	}

	public int getCustomerAge() {
		return this.customerAge;
	}

	public void setCustomerName(String newName)
	{
		if (newName == null || newName.isBlank()) {
			System.out.println("Customer Name can not be null or blank");
		}else {
			this.customerName = newName;
		}
	}

	public String getCustomerName() {
		return this.customerName;
	}
}
