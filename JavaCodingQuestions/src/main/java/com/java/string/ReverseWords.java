package com.java.string;
import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Give me your input");
		String input = scanner.nextLine();;
		System.out.println(reverseWords(input));
		scanner.close();


	}

	private static String reverseWords(String input) {
		if(input == null || input.isEmpty()){
			return input;
		}

		String[] allWords = input.trim().split("\\s+");
		StringBuilder reversedSentence = new StringBuilder();
		for(int i=allWords.length-1;i>=0;i--) {
			reversedSentence.append(allWords[i]);
			if(i != 0) {
				reversedSentence.append(" ");
			}
		}
		return reversedSentence.toString();
	}

}
