package com.java.dsa;

public class FindRichestCustomer {

	public static void main(String[] args) {
		double[] allAccounBalances = { 30000, -600, 900, 1000000, 12000, 0, -400, 250000 };
		System.out.println("The richest customer account balance : " + findRichestCustomer(allAccounBalances));
	}

	private static double findRichestCustomer(double[] balances) {
		if (balances == null || balances.length == 0) {
			return 0;
		}
		double max = balances[0];
		for (int i = 1; i < balances.length; i++) {

			if (max < balances[i]) {
				max = balances[i];
			}
		}

		return max;
	}

}
