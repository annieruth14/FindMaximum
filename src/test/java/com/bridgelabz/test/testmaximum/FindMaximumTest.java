package com.bridgelabz.test.testmaximum;

import org.junit.Assert;
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
	@Test
	public void givenIntegers_whenFindMaxAtPosition1_returnTrue() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(8, 5, 7);
		Assert.assertEquals(8, maximumInt);
	}
	@Test
	public void givenIntegers_whenFindMaxAtPosition2_returnTrue() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(5, 8, 2);
		Assert.assertEquals(8, maximumInt);
	}
	@Test
	public void givenIntegers_whenFindMaxAtPosition3_returnTrue() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(10, 8, 12);
		Assert.assertEquals(12, maximumInt);
	}
}
