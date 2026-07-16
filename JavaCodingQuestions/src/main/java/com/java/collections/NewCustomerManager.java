package com.java.collections;

import java.util.HashSet;

public class NewCustomerManager {

	public static void main(String[] args) {
		HashSet<Customer> customers = new HashSet<>();
		customers.add(new Customer("A123", "Kalyani"));
		customers.add(new Customer("A123", "Kalyani"));

		System.out.println(customers);
		System.out.println(customers.size());
	}
}
