package com.java.exceptions;

public class BankTransaction {

	public static void main(String[] args) {
		try {

			withdrawal(5000, 7000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public static void withdrawal (double balance, double amount) throws InsufficientBalanceException{
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}

		System.out.println("Sucessful wihdrwal");
	}

}
