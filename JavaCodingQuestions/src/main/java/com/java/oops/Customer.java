package com.java.oops;

public class Customer {
	String customerName;
	int customerAge;
	String accountNumber;
	double accountBalance;

	public Customer(String customerName, 
			int customerAge,
			String accountNumber, 
			double accountBalance){
		this.customerName  = customerName;
		this.customerAge = customerAge;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	void displayCustomerDetails() {
		System.out.println("Customer Details : ");
		System.out.println("Customer Name : "+customerName);
		System.out.println("Customer Age : "+customerAge);
		System.out.println("Customer Account Number : "+accountNumber);
		System.out.println("Customer Account Balance : "+accountBalance);

	}

	void deposit( double amount) {
		this.accountBalance += amount;

	}

	void withdraw(double amount) {
		this.accountBalance -= amount;

	}

	double checkBalance() {
		return this.accountBalance;
	}

	public static void main(String[] args) {
		Customer customer1 = new Customer("Kalyani",30,"FIN1001",50000);
		Customer customer2 = new Customer("Rohit",30,"FIN1002",25000);
		customer1.displayCustomerDetails();
		customer2.displayCustomerDetails();
		customer1.deposit(5000);
		customer2.deposit(5000);
		customer1.withdraw(2000);
		customer2.withdraw(2000);
		System.out.println("Customer1 Final Account Balance : " + customer1.checkBalance());
		System.out.println("Customer2 Final Account Balance : " + customer2.checkBalance());


	}

}
