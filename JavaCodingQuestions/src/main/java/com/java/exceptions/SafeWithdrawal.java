package com.java.exceptions;

public class SafeWithdrawal {

	public static void main(String[] args) {
		try {
			withdrawal(5000, 7000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void withdrawal(double balance, double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}

		if (amount > balance) {
			throw new RuntimeException("Insufficient balance");
		}

		System.out.println("Sucessful Withdrawal");
	}

}
