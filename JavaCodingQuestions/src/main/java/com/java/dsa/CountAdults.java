package com.java.dsa;

public class CountAdults {

	public static void main(String[] args) {
		int[] ages = { 32, 45, 6, 98, 11 };
		System.out.println("Number of adults in the given array are " + countAdults(ages));
	}

	private static int countAdults(int[] ages) {
		int count = 0;
		if (ages != null) {
			if (ages.length <= 0) {
				System.out.println("Given array is empty");
				return count;
			} else {
				for (int age : ages) {
					if (age >= 18) {
						count++;
					}
				}
				return count;
			}
		}
		return count;
	}

}
