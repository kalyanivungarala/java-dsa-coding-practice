package com.java.inheritance;

import com.java.interfaces.InsuranceEligibility;
import com.java.interfaces.LoanEligibility;

public class SavingsAccount extends Account implements LoanEligibility, InsuranceEligibility {
	private double interestRate;

	public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = (super.balance * interestRate) / 100;
		super.balance += interest;
		System.out.println("Interset : " + interest);
	}

	@Override
	public boolean isLoanEligible() {
		return this.balance >= 50000;
	}

	@Override
	public double getMaximumLoanAmount() {
		if (isLoanEligible()) {
			System.out.println("Eligible for Loan !!");
			return balance * 5;
		} else {
			return 0;
		}
	}

	@Override
	public boolean isInsuranceEligible() {
		return balance >= 100000;
	}

	@Override
	public double getMaximumInsuranceAmount() {
		if (isInsuranceEligible()) {
			return balance * 2;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("444", "Kalyani", 50000, 9);
		System.out.println("Is Loan Eligible" + savingsAccount.isLoanEligible());
		System.out.println("Maximum loan amount " + savingsAccount.getMaximumLoanAmount());
		savingsAccount.printRules();
		LoanEligibility.displayBankName();
	}
}
