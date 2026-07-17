package com.java.filehandling;

import java.io.File;

public class ListFilesDemo {
	
	public static void main(String[] args) {
		File folder = new File("src/main/resources");
		File[] allResourceFiles = folder.listFiles();
		if(allResourceFiles != null) {
			for(File file :allResourceFiles) {
				System.out.println("File Name : "+file.getName());
			}
		}
	}

}
