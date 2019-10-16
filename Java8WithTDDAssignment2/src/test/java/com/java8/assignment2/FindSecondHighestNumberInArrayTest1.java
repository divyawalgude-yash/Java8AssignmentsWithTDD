package com.java8.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSecondHighestNumberInArrayTest1 {

	FindSecondHighestNumberInArray1 findSecondHighest = new FindSecondHighestNumberInArray1();

	@Test
	public void shouldCheckArrayIsNotNull() {
		Integer[] arr = { 4, 7, 5, 8, 9 };
		int actualResult = findSecondHighest.findSecondHighestNumber(arr);
		assertEquals(8, actualResult);
	}

	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfArrayIsNull() {
		findSecondHighest.findSecondHighestNumber(null);
	}

	@Test
	public void shouldReturnHighestNumberFromGivenArray() {
		Integer[] arr = { 4, 7, 5, 10, 9 };
		int actualResult = findSecondHighest.findSecondHighestNumber(arr);
		assertEquals(9, actualResult);
	}

}
