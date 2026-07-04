package com.java.operators;

public class EmployeeBonus {
	
	public static void main(String[] args) {
		String empName = "Kalyani";
		double empSalary = 3500000;
		int yrsOfExp = 16;
		if(yrsOfExp >=15 && empSalary <3000000) {
			System.out.println("Eligible for Salary review");
		}else {
			System.out.println("continu current compensation");
		}
	}

}
