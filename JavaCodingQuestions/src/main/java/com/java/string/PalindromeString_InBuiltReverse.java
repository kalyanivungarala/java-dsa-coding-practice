package com.java.string;
import java.util.Scanner;

public class PalindromeString_InBuiltReverse {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Please provide your input");
		String input = scanner.nextLine();
		boolean isPalindrome = isPalindromeString(input);
		if(isPalindrome) System.out.println("Given String is a palindrome");
		else System.out.println("Given string is not a palindrome");
		scanner.close();
	}
	
	private static boolean isPalindromeString(String input) {
		if ( input  == null ) return false;
		String originalText = input;
		StringBuilder reverseText = new StringBuilder(originalText);
		reverseText = reverseText.reverse();
		return originalText.equalsIgnoreCase(reverseText.toString());
	}

}
