package com.java.filehandling;

import java.io.File;

public class ReportDirectoryCreator {

	public static void main(String[] args) {
		File folder = new File("reports/2026/July");
		boolean isDirectoryCreated = folder.mkdirs();
		System.out.println("Directory Created : " + isDirectoryCreated);
		System.out.println("Directory Exists : " + folder.exists());
		System.out.println(folder);
		System.out.println(folder.getName());
	}
}
