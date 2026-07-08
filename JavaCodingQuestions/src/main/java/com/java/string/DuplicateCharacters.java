package com.java.string;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String input = scanner.nextLine();
		HashMap<Character, Integer> countOccurrences = countOccurrences(input);
		Set<Entry<Character, Integer>> entrySet = countOccurrences.entrySet();
		boolean isDuplicateFound = false;
		for (Entry<Character, Integer> character : entrySet) {
			if(character.getValue() > 1) { //Means the character appeared more than once
				isDuplicateFound = true;
				System.out.println("Duplicate character is "+character.getKey());
				System.out.println(" Appeared times "+character.getValue()	);
			}
		}

		if( !isDuplicateFound) {
			System.out.println("No duplicate entries found");
		}
		scanner.close();
	}

	private static HashMap<Character,Integer> countOccurrences(String input){
		HashMap<Character,Integer> characterVsCount = new HashMap<Character, Integer>();
		if (input == null || input.isEmpty()) return characterVsCount;
		for(Character ch:input.toCharArray()) {
			characterVsCount.put(ch, characterVsCount.getOrDefault(ch, 0)+1);
		}
		return characterVsCount;
	}

}
