package com.java.collections;

import java.util.ArrayList;

public class CustomerManager {
	public static void main(String[] args) {
		ArrayList<String> customers = new ArrayList<String>();
		customers.add("Kalyani");
		customers.add("Bhargav");
		customers.add("Srinivas");
		customers.add("Tulasi");
		customers.add("Kalyani");

		System.out.println(customers);
		System.out.println(customers.get(2));
		System.out.println(customers.size());
		customers.remove("Bhargav");
		System.out.println(customers);

	}

}
