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
		Assert.assertEquals(maximumInt, 8);
	}
	@Test
	public void givenIntegers_whenFindMaxAtPosition2_returnTrue() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(5, 8, 2);
		Assert.assertEquals(maximumInt, 8);
	}
	@Test
	public void givenIntegers_whenFindMaxAtPosition3_returnTrue() {
		int maximumInt = findMaximum.maximumAmongThreeIntegers(10, 8, 12);
		Assert.assertEquals(maximumInt , 12);
	}

	@Test
	public void givenFloats_whenFindMaxAtPosition1_returnTrue() {
		float maximumFloat = findMaximum.maximumAmongThreeFloat(8.5f, 5.8f, 7.8f);
		Assert.assertEquals(maximumFloat, 8.5f, 0.0f);
		//(8, maximumFloat);
	}
	@Test
	public void givenFloats_whenFindMaxAtPosition2_returnTrue() {
		float maximumFloat = findMaximum.maximumAmongThreeFloat(5.3f, 8.6f, 2.4f);
		Assert.assertEquals(maximumFloat, 8.6f, 0.0f);
	}
	@Test
	public void givenFloats_whenFindMaxAtPosition3_returnTrue() {
		float maximumFloat = findMaximum.maximumAmongThreeFloat(10.9f, 8.7f, 12.4f);
		System.out.println(maximumFloat);
		Assert.assertEquals(maximumFloat, 12.4f, 0.0f);
	}
}
