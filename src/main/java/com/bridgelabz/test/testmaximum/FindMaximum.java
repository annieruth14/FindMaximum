package com.bridgelabz.test.testmaximum;

public class FindMaximum {
	// Welcome message
	public void welcomeMessage() {
		System.out.println("Welcome to Test Maximum of 3 variables");
	}

	// Find maximum among three integers
	public int maximumAmongThreeIntegers(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (y.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
