package com.java.dsa;

public class IsEvenNumber {
	public static void main(String[] args) {
		int input = -8;
		boolean isEven = isEven(input);
		if (isEven) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
