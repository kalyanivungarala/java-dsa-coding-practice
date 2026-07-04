package com.java.string;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] words = input.split(" ");
		String reverseStmt = "";
		for(String word:words) {
			StringBuffer sb = new StringBuffer(word);
			
			sb.reverse();
			reverseStmt += sb.toString()+" ";
			
		}
		
		scanner.close();
		
		System.out.println(reverseStmt);

	}

}
