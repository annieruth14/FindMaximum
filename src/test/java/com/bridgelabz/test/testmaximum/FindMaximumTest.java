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
	public void givenIntegers_whenFindMax_returnTrue() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(5, 8, 2);
		Assert.assertEquals(8, maximumInt);
	}
	@Test
	public void givenIntegers_whenNotFindMax_returnFalse() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(10, 8, 12);
		Assert.assertNotEquals(8, maximumInt);
	}
}
