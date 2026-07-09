package com.java.methods;

public class MaxOfNumbers {
	public static void main(String[] args) {
		System.out.println(findMaximum( 4,9));
	}
	
	private static int findMaximum(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

}
