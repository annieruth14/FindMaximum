package com.bridgelabz.test.testmaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
	FindMaximum findMaximum = null;

	@Before
	public void start() {
		findMaximum = new FindMaximum(null, null, null);
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
		Assert.assertEquals(maximumInt, 12);
	}

	@Test
	public void givenFloats_whenFindMaxAtPosition1_returnTrue() {
		float maximumFloat = findMaximum.maximumAmongThreeFloat(8.5f, 5.8f, 7.8f);
		Assert.assertEquals(maximumFloat, 8.5f, 0.0f);
		// (8, maximumFloat);
	}

	@Test
	public void givenFloats_whenFindMaxAtPosition2_returnTrue() {
		float maximumFloat = findMaximum.maximumAmongThreeFloat(5.3f, 8.6f, 2.4f);
		Assert.assertEquals(maximumFloat, 8.6f, 0.0f);
	}

	@Test
	public void givenFloats_whenFindMaxAtPosition3_returnTrue() {
		float maximumFloat = findMaximum.maximumAmongThreeFloat(10.9f, 8.7f, 12.4f);
		Assert.assertEquals(maximumFloat, 12.4f, 0.0f);
	}

	@Test
	public void givenString_whenFindMaxAtPosition1_returnTrue() {
		String maximumString = findMaximum.maximumAmongThreeStrings("Peach", "Apple", "Banana");
		Assert.assertEquals(maximumString, "Peach");
	}

	@Test
	public void givenString_whenFindMaxAtPosition2_returnTrue() {
		String maximumString = findMaximum.maximumAmongThreeStrings("Banana", "Peach", "Apple");
		Assert.assertEquals(maximumString, "Peach");
	}

	@Test
	public void givenString_whenFindMaxAtPosition3_returnTrue() {
		String maximumString = findMaximum.maximumAmongThreeStrings("Banana", "Apple", "Peach");
		Assert.assertEquals(maximumString, "Peach");
	}

	@Test
	public void givenFloat_whenFindMax_returnTrue() {
		Float xFloat = 10.f, yFloat = 19.6f, zFloat = 14.9f;
		findMaximum = new FindMaximum(xFloat, yFloat, zFloat);
		Comparable maximumFloat = findMaximum.testMaximum();
		Assert.assertEquals(maximumFloat, 19.6f);
	}

	@Test
	public void givenInteger_whenFindMax_returnTrue() {
		Integer xInt = 10, yInt = 19, zInt = 14;
		findMaximum = new FindMaximum(xInt, yInt, zInt);
		Comparable maximumInt = findMaximum.testMaximum();
		Assert.assertEquals(maximumInt, 19);
	}

	@Test
	public void givenString_whenFindMax_returnTrue() {
		String xString = "Peach", yString = "Banana", zString = "Apple";
		findMaximum = new FindMaximum(xString, yString, zString);
		Comparable maximumString = findMaximum.testMaximum();
		Assert.assertEquals(maximumString, "Peach");
	}

	@Test
	public void givenOptionalValues_whenFindMax_returnTrue() {
		Integer xInt = 10, yInt = 19, zInt = 14, aInt = 2, bInt = 24, cInt = 5;
		Comparable maximumInt = findMaximum.testMaximumAmongOptionalValues(xInt, yInt, zInt, aInt, bInt, cInt);
		Assert.assertEquals(maximumInt, 24);
	}
}
