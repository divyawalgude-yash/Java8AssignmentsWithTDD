package com.java8.assignment2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FindLeadersInArrayTest {

	FindLeadersInArray findLeaders=new FindLeadersInArray();
	
	@Test
	public void shouldReturnAllLeadersInArray()
	{
		int[] inputArr= {22,23,4,8,11};
		int[] expectedArr={11,23,0,0,0};
		int[] actualResult=findLeaders.findLeaders(inputArr);
		assertArrayEquals(expectedArr, actualResult);
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldReturnTrowExceptionIfGivenArrayIsNull()
	{
		findLeaders.findLeaders(null);
	}
}
