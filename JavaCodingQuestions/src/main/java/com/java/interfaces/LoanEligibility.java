package com.java.interfaces;

public interface LoanEligibility {

	boolean isLoanEligible();

	double getMaximumLoanAmount();
	
	default void printRules() {
		System.out.println("For Loan sanction the account balance should be minumum 500000");
	}
	
	public static void displayBankName() {
		System.out.println("Welcome to FinSphere bank");
	}

}
