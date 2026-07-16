package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueAccounts {

	public static void main(String[] args) {
		HashSet<String> accountNumbers = new HashSet<>();
		accountNumbers.add("A123");
		accountNumbers.add("A456");
		accountNumbers.add("A123");
		accountNumbers.add("A789");
		accountNumbers.add("A123");

		System.out.println(accountNumbers);
		for (String accountNumber : accountNumbers) {
			System.out.println("Account Number : " + accountNumber);
		}
		
		System.out.println("Number of unique accounts " + accountNumbers.size() );

		for(Iterator<String> iterator = accountNumbers.iterator();iterator.hasNext();) {
			System.out.println("Account Number : " + iterator.next());
		}
	}

}
