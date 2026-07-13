package com.java.dsa;

public class FindAverageBalance {
	public static void main(String[] args) {
		double[] balances = {4500, 9800, -500, 15000, 7600};
		System.out.println("Average of all the balances is " + findAverageBalance(balances));

	}

	private static double findAverageBalance(double[] balances) {
		if ( balances == null || balances.length == 0) {
			return 0;
		}
		double avgBalance = 0;
		for (double balance : balances) {
			avgBalance += balance;
		}

		return avgBalance /= (balances.length);
	}

}
