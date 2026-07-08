package com.java.string;
import java.util.Scanner;

public class PalindromeString_TwoPointer2 {
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
		input = input.toLowerCase();
		int reverseIndex = input.length()-1;
		for ( int i = 0; i < input.length() /2; i ++) {
			if( input.charAt(i) != input.charAt(reverseIndex)) return false;
			reverseIndex--;
		}
		return true;
	}
}
