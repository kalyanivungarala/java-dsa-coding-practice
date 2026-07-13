package com.java.dsa;

public class CalculateTotalBalances {

	public static void main(String[] args) {
		double[] allBalances = { 4500, 9800, -500, 15000, 7600 };
		System.out.println("Total balances value after addition is " + calculateTotalBalances(allBalances));
	}

	private static double calculateTotalBalances(double[] allBalances) {
		double total = 0;
		if (allBalances == null || allBalances.length == 0) {
			return total;
		}
		for (double eachBalance : allBalances) {
			total += eachBalance;
		}
		return total;
	}

}
