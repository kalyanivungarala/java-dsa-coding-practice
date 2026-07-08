package com.java.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicaeArrays {
	public static void main(String[] args) {
		int[] inputNumbers = {1,2,1,3,4,2,1,5,3,3,2};
		giveDuplicateNumbers(inputNumbers);


	}

	private static void giveDuplicateNumbers(int[] inputNumbers) {
		Object[] array = Arrays.asList(inputNumbers).stream().distinct().collect(Collectors.toList()).toArray();
		for (Object object : array) {
			System.out.println(object);
		}

	}

}
