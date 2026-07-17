package com.java.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResourcesDemo {

	public static void main(String[] args) {
		String fileLocation = "/Users/gopichandmeesala/git/repository_java/JavaCodingQuestions/src/main/resources/customers.txt";

		String nextLine;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
			while ((nextLine = reader.readLine()) != null) {
				System.out.println(nextLine);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
