package com.java.string;

public class CountWords {
	
	public static void main(String[] args) {
		String stmt = "In this stmt we are counting number of words";
		String[] words = stmt.split(" ");
		int countOfWords = words.length;
		System.out.println("countOfWords" +countOfWords);
		System.out.println(words.toString());
	}

}
