package com.java.collections;

public class Customer {

	private String accountNumber;
	private String customerName;

	public Customer(String accountNumber, String customerName) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	@Override	
	public String toString() {
		return "Customer Name : " + customerName + "| Account Number " + accountNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer otherObj = (Customer)obj;
		return (this.customerName.equals(otherObj.customerName) && 
				this.accountNumber.equals(otherObj.accountNumber));
	}
	
	@Override
	public int hashCode() {
		return accountNumber.hashCode() + customerName.hashCode();
	}

}
