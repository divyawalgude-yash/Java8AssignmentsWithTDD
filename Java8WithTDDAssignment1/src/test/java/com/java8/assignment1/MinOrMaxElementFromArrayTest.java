package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.java8.assignment1.MinOrMaxElementFromArray;

public class MinOrMaxElementFromArrayTest {

	MinOrMaxElementFromArray minMaxArray = new MinOrMaxElementFromArray();
	Integer[] arr = { 9, 3, 5, 7, 2, 8, 5 };

	@Test
	public void shouldReturnCheckMaxNumberFromArray() {
		Integer max = 9;
		Map<String, Integer> minMaxMap = minMaxArray.getMinMaxFromGivenArray(arr);
		assertEquals(max, minMaxMap.get("max"));
	}

	@Test
	public void shouldReturnCheckMinNumberFromArray() {
		Integer min = 2;
		Map<String, Integer> minMaxMap = minMaxArray.getMinMaxFromGivenArray(arr);
		assertEquals(min, minMaxMap.get("min"));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnTrowNullPointerExceptionWhenArrayIsNull() {

		Map<String, Integer> minMaxMap = minMaxArray.getMinMaxFromGivenArray(null);
	}
}
