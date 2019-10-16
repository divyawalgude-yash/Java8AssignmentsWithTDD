package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java8.assignment1.CountNumberOfVowelInString;

public class CountNumberOfVowelInStringTest {

	CountNumberOfVowelInString countvowel= new CountNumberOfVowelInString();
	
	
	@Test
	public void shouldReturnCountOfVowelIfGivenStringIsNotNull()
	{
		Integer actualCount=countvowel.getCountOfVowelFromString("divyaWalgudeo");
		assertEquals(new Integer(6), actualCount);
	}
	
	@Test
	public void shouldReturnCountOfVowelIFStringContainA()
	{
		Integer actualCount=countvowel.getCountOfVowelFromString("dvyaWal");
		assertEquals(new Integer(2), actualCount);
	}
	
	@Test
	public void shouldReturnCountOfVowelIFStringContainE()
	{
		Integer actualCount=countvowel.getCountOfVowelFromString("divyaWale");
		assertEquals(new Integer(4), actualCount);
	}
	
	@Test
	public void shouldReturnCountOfVowelIFStringContainI()
	{
		Integer actualCount=countvowel.getCountOfVowelFromString("divyaWal");
		assertEquals(new Integer(3), actualCount);
	}
	
	@Test
	public void shouldReturnCountOfVowelIFStringContainU()
	{
		Integer actualCount=countvowel.getCountOfVowelFromString("divyaWalu");
		assertEquals(new Integer(4), actualCount);
	}
	@Test
	public void shouldReturnCountOfVowelIFStringContainO()
	{
		Integer actualCount=countvowel.getCountOfVowelFromString("divyaWal");
		assertEquals(new Integer(3), actualCount);
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnThrowIfGivenStringIsNull()
	{
		countvowel.getCountOfVowelFromString(null);
	}
}
