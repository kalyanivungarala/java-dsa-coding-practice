package com.java.string;
import java.util.Scanner;

public class PalindromeString_TwoPointer {
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
		char[] totalChars = input.toLowerCase().toCharArray();
		int reverseIndex = totalChars.length-1;
		for ( int i = 0; i < totalChars.length /2; i ++) {
			if( totalChars[i] != totalChars[reverseIndex]) return false;
			reverseIndex--;
		}
		return true;
	}
}
