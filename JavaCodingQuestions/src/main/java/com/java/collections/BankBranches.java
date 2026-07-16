package com.java.collections;

import java.util.LinkedHashSet;

public class BankBranches {
	
	public static void main(String[] args) {
		LinkedHashSet<String> bankBranches = new LinkedHashSet<>();
		bankBranches.add("Hyderabad");
		bankBranches.add("Bangalore");
		bankBranches.add("Chennai");
		bankBranches.add("Hyderabad");
		bankBranches.add("Pune");
		
		System.out.println(bankBranches);
	}

}
