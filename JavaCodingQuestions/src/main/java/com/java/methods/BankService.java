package com.java.methods;

public class BankService {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		bankService.displayName();
		bankService.displayWelcomeMessage("Welcome to Finsphere bank");
		String bankCode = bankService.getBankCode();
		System.out.println(" Our Bank Code is " + bankCode);
		boolean isCustomerAgeValid = bankService.validateCustomerAge(25);
		System.out.println(isCustomerAgeValid);
		isCustomerAgeValid = bankService.validateCustomerAge(3);
		System.out.println(isCustomerAgeValid);

		double simpleInterest = bankService.calculateSimpleInterest(1000, 5, 2);
		System.out.println("Interest for the given values is " + simpleInterest);
	}
	void displayName(){
		System.out.println("******** Our Bank name is FinSphere" );

	}
	void displayWelcomeMessage(String welcomeMessage) {
		System.out.println(welcomeMessage);
	}

	String getBankCode() {
		return "FINS";
	}

	boolean validateCustomerAge(int age) {
		return age >= 5;

	}

	double calculateSimpleInterest(double principal, double rate, int years) {
		return (principal*rate*years)/100;
	}


}
