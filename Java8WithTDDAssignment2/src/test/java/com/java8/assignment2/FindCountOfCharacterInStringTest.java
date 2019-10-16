package com.java8.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FindCountOfCharacterInStringTest {

	
	FindCountOfCharacterInString FindCount=new FindCountOfCharacterInString();
	
	@Test
	public void shouldCheckGivenStringIsNotNull()
	{
		String exceptedResult="divya";
		String actualResult=FindCount.findCharacterInString("divya");
		assertEquals(exceptedResult, actualResult);
	}
	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfGivenStringIsNull()
	{
		FindCount.findCharacterInString(null);
	}
	
	@Test
	public void shouldReturnCountOfCharacterInGivenString()
	{
		String exceptedResult="di2v2ya3";
		String actualResult=FindCount.findCharacterInString("diivvyaaa");
		assertEquals(exceptedResult, actualResult);
	}
	
	
	
	
}
