package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerTraversal {

	public static void main(String[] args) {
		ArrayList<String> customers = new ArrayList<>();
		customers.add("Kalyani");
		customers.add("Srinivas");
		customers.add("Tulasi");
		customers.add("Bhargav");

		System.out.println(customers);

		for (int i = 0; i < customers.size(); i++) {
			System.out.println("From for loop" + customers.get(i));
		}

		for (String customerName : customers) {
			System.out.println("From enahnced for loop :" + customerName);
		}

		for (Iterator iterator = customers.iterator(); iterator.hasNext();) {
			String customerName = (String) iterator.next();
			System.out.println("From itreator for loop :" + customerName);
		}
	}
}
