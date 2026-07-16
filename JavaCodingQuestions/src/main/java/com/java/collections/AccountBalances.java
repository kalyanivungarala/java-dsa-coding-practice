package com.java.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AccountBalances {

	public static void main(String[] args) {
		HashMap<String, Double> accountBalances = new HashMap<String, Double>();
		accountBalances.put("A123", 5000.0);
		accountBalances.put("A456", 12000.0);
		accountBalances.put("A789", 8000.0);

		System.out.println("The balance of account A456 : " + accountBalances.get("A456"));
		System.out.println("Does account A99 exists ? : " + accountBalances.containsKey("A999"));
		accountBalances.remove("A123");
		Set<Entry<String, Double>> entrySet = accountBalances.entrySet();
		for (Entry<String, Double> accountBalance : entrySet) {
			System.out.println(
					"Account Number : " + accountBalance.getKey() + " | Account Balance : " + accountBalance.getValue());
		}
	}

}
