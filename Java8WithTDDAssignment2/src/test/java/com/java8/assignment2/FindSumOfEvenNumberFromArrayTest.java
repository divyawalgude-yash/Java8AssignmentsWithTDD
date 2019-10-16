package com.java8.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSumOfEvenNumberFromArrayTest {

	FindSumOfEvenNumberFromArray findSum=new FindSumOfEvenNumberFromArray();
	
	@Test
	public void shouldReturnSumOfEvenNumberFromArray()
	{
		Integer[] arr= {2,6,4,7,9,3};
		int actual=findSum.findSum(arr);
		assertEquals(12, actual);
	}
	
	@Test
	public void shouldReturnZeroIfEvenNumberNotFounds()
	{
		Integer[] arr= {5,3,1,7,9,3};
		int actual=findSum.findSum(arr);
		assertEquals(0, actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfGivenArrayIsNull()
	{
		findSum.findSum(null);
	}
}
