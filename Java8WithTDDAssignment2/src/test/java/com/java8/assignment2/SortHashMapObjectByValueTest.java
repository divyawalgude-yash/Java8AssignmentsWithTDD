package com.java8.assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class SortHashMapObjectByValueTest {

	SortHashMapObjectByValue sortValue = new SortHashMapObjectByValue();

	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfGivenInputMapIsNull() {
		 sortValue.sortMapByValue(null);
	}
	
	@Test
	public void shouldReturnTrueIfGivenHashMapIsSorted() {
		Map<String, Integer> inputMap = new LinkedHashMap<String, Integer>();
		inputMap.put("divya", 22);
		inputMap.put("pranali", 23);
		inputMap.put("mitali", 10);
		inputMap.put("nikhil", 11);
		inputMap.put("monali", 25);

		Map<String, Integer> expextedMap = new LinkedHashMap<String, Integer>();
		expextedMap.put("mitali", 10);
		expextedMap.put("nikhil", 11);
		expextedMap.put("divya", 22);
		expextedMap.put("pranali", 23);
		expextedMap.put("monali", 25);

		Map<String, Integer> actualResult = sortValue.sortMapByValue(inputMap);
		assertEquals(expextedMap.toString(), actualResult.toString());

	}
	
	@Test
	public void shouldReturnTrueIfGivenHashMapIsNotSorted() {
		Map<String, Integer> inputMap = new LinkedHashMap<String, Integer>();
		inputMap.put("divya", 22);
		inputMap.put("pranali", 23);
		inputMap.put("mitali", 10);
		inputMap.put("nikhil", 11);
		inputMap.put("monali", 25);

		Map<String, Integer> expextedMap = new LinkedHashMap<String, Integer>();
		expextedMap.put("mitali", 10);
		expextedMap.put("divya", 22);
		expextedMap.put("pranali", 23);
		expextedMap.put("nikhil", 11);
		expextedMap.put("monali", 25);

		Map<String, Integer> actualResult = sortValue.sortMapByValue(inputMap);
		assertNotEquals(expextedMap.toString(), actualResult.toString());

	}
	
	
}
