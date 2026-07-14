package com.java.exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			int num = 10 / 0;
			System.out.println("Inside try");
		} catch (ArithmeticException e) {
			System.out.println("Inside ArithmeticException catch block");
		} finally {
			System.out.println("Inside finally");
		}

		System.out.println("Program Completed !!");
	}

}
