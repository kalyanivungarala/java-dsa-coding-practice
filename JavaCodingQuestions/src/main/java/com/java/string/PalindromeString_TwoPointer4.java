package com.java.string;
import java.util.Scanner;

public class PalindromeString_TwoPointer4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give the input : ");
		String input = scanner.nextLine();
		if ( isPalindrome(input) ) System.out.println("Given String is a plaidrome");
		else System.out.println("Given String is not a plaidrome");
		scanner.close();
	}

	private static boolean isPalindrome(String input) {
		if ( input == null || input.isEmpty()) return false;
		int left = 0;
		int right = input.length()-1;
		while(left < right) {
			if(Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) return false;
			left++;
			right--;
		}
		return true;
	}
}
