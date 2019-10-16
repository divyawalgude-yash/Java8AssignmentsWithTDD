package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java8.assignment1.SpyNumber;

public class SpyNumberTest {

	SpyNumber spyNumber = new SpyNumber();

	@Test
	public void shouldReturnTrueIfUserInputIsNotNull() {
		boolean result = spyNumber.CheckSpyNumber(22);
		assertEquals(true, result);
	}

	@Test
	public void shouldReturnFalseUserInputIsNull() {
		boolean result = spyNumber.CheckSpyNumber(null);
		assertEquals(false, result);
	}

	@Test
	public void shouldReturnTrueIfGivenNumberIsSpyNumber() {
		boolean result = spyNumber.CheckSpyNumber(22);
		assertEquals(true, result);
	}

	@Test
	public void shouldReturnTrueIfGivenNumberIsNotSpyNumber() {
		boolean result = spyNumber.CheckSpyNumber(767);
		assertEquals(false, result);
	}
}
