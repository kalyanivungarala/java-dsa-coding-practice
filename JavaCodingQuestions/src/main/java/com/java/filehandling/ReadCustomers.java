package com.java.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCustomers {

	public static void main(String[] args) {
		try {

			FileReader file = new FileReader("/Users/gopichandmeesala/git/repository_java/JavaCodingQuestions/src/main/resources/customers.txt");
			BufferedReader reader = new BufferedReader(file);
			while (reader.readLine() != null) {
				System.out.println(reader.readLine());
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
