package com.java.string;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input :");
		String originalString = input.nextLine();
		System.out.println(reverseString(originalString));
		input.close();
	}

	private static String reverseString(String originalString) {
		if(originalString == null || originalString.isEmpty()) {
			System.out.println("Input can not null or empty");	
			return originalString;
		}
		int strLength = originalString.length();
		StringBuilder reverseString = new StringBuilder();
		for(int i=strLength-1;i>=0;i--) {
			reverseString.append(originalString.charAt(i));
		}
		return reverseString.toString();

	}

}
