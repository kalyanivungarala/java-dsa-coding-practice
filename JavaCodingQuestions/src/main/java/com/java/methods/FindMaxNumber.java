package com.java.methods;

public class FindMaxNumber {
	public static void main(String[] args) {
		int[] numbers = { 3,2,99,4,56,134,42};
		if (numbers != null && numbers.length > 0) {
			int maxNumber = findMaxNumber(numbers);
			System.out.println("Max  number in the array is "+maxNumber);
		}
	}

	private static int findMaxNumber(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

}
