package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java8.assignment1.FindWrongNumberFromSeries;
import com.java8.exception1.InvalidInputException;
import com.java8.exception1.NumberNotFoundException;

public class FindWrongNumberFromSeriesTest {

	FindWrongNumberFromSeries findWrongNumber = new FindWrongNumberFromSeries();

	@Test
	public void shouldReturnCheckArrayIsNotNull() {
		Integer arr[] = { 3, 12, 8, 19, 13, 32, 18, 42, 23, 52 };

		int actualResult = findWrongNumber.getWrongNumberFromList(arr);
		assertEquals(19, actualResult);
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnThrowNullPointerExceptionIfGivenArrayIsNull() {
		findWrongNumber.getWrongNumberFromList(null);
	}

	@Test
	public void shouldReturnWrongNumberSuccesfully() {
		Integer arr[] = { 3, 12, 8, 22, 12, 32, 18, 42, 23, 52 };

		int actualResult = findWrongNumber.getWrongNumberFromList(arr);
		assertEquals(12, actualResult);
	}

	@Test
	public void shouldReturnZeroIfWrongNumberIsNotFound() {
		Integer arr[] = { 3, 12, 8, 22, 13, 32, 18, 42, 23, 52 };

		int actualResult = findWrongNumber.getWrongNumberFromList(arr);
		assertEquals(0, actualResult);
	}

}
