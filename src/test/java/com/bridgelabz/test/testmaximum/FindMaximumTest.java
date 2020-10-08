package com.bridgelabz.test.testmaximum;

import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
	FindMaximum findMaximum = null;

	@Before
	public void start() {
		findMaximum = new FindMaximum();
	}

	@Test
	public void welcome() {
		findMaximum.welcomeMessage();
	}
}
