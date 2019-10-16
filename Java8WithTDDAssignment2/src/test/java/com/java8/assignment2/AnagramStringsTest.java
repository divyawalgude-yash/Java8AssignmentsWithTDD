package com.java8.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnagramStringsTest {

	AnagramStrings anagramStrings=new AnagramStrings();
	
	@Test
	public void shouldRetuntrueIfGivenStringIsNotNull()
	{
		
		boolean actual=anagramStrings.checkAnagramString("divya","divya");
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldRetuntrueIfGivenStringBothStringAnagram()
	{
		
		boolean actual=anagramStrings.checkAnagramString("Keep","Peek");
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldRetunFalseIfGivenStringBothStringLengthIsNotEqual()
	{
		
		boolean actual=anagramStrings.checkAnagramString("Keepe","Peek");
		assertEquals(false, actual);
	}
	
	@Test
	public void shouldRetunFalseIfGivenStringBothStringsAreNotAnagram()
	{
		
		boolean actual=anagramStrings.checkAnagramString("Keepe","Peeka");
		assertEquals(false, actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfGivenFirstStringIsNull()
	{
		anagramStrings.checkAnagramString(null,"divya");
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfGivenSecondStringIsNull()
	{
		anagramStrings.checkAnagramString("divya",null);
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfGivenBothStringIsNull()
	{
		anagramStrings.checkAnagramString(null,null);
	}
}
