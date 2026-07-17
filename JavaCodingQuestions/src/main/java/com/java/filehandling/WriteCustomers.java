package com.java.filehandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCustomers {

	public static void main(String[] args) {
		String fileLocation = "/Users/gopichandmeesala/git/repository_java/JavaCodingQuestions/src/main/resources/transactions.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))) {

			writer.write("Deposit : 5000");
			writer.newLine();
			writer.write("Withdrawal : 2000");
			writer.newLine();
			writer.write("Transfer : 1000");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

}
