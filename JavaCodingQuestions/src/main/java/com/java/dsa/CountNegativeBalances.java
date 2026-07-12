package com.java.dsa;

public class CountNegativeBalances {
	public static void main(String[] args) {
		double[] balances = { 345, 212, 456, 78, -68, -90 };
		System.out.println("Number of nagative balances are " + countNegativeBalances(balances));
	}

	private static int countNegativeBalances(double[] balances) {
		int count = 0;
		if (balances == null || balances.length == 0) {
			return count;
		}
		for (double balance : balances) {
			if (balance < 0) {
				count++;
			}
		}
		return count;
	}

}
