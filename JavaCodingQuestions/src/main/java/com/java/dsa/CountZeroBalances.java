package com.java.dsa;

public class CountZeroBalances {

	public static void main(String[] args) {
		double[] allBalances = { 4500, 0, -500, 0, 7600, 10000, 0 };
		System.out.println("Number of accounts having zero balances are :" + countZeroBalanceAccounts(allBalances));
	}

	public static int countZeroBalanceAccounts(double[] allAccountBalances) {
		if (allAccountBalances == null || allAccountBalances.length == 0) {
			return 0;
		}
		int count = 0;
		for (double accountBalance : allAccountBalances) {
			if (accountBalance == 0) {
				count++;
			}
		}
		return count;
	}
}
