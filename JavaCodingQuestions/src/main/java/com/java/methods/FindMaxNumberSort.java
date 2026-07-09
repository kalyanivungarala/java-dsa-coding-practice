package com.java.methods;

import java.util.Arrays;

public class FindMaxNumberSort {
	
	public static void main(String[] args) {
		int[] numbers = {55,78,34,98};
		if(numbers != null && numbers.length > 0 ) {
			int maxNumber = findMaxNumber(numbers);
			System.out.println(maxNumber);
		}
		
	}
	
	private static int findMaxNumber(int[] numbers) {
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		return numbers[numbers.length-1];
		
	}

}
