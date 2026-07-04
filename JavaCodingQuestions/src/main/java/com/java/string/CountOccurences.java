package com.java.string;

public class CountOccurences {
	
	public static void main(String[] args) {
		String str = "Learning Java DSA coding questions";
		char ch = 'L';
		int count = 0;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(c == ch) {
				count += 1;
			}
		}
		System.out.println("Number of times char : "+ch+" occured "+count);
	}

}
