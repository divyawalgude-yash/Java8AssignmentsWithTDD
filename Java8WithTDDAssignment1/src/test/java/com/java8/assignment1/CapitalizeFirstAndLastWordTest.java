package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java8.assignment1.CapitalizeFirstAndLastWord;
import com.java8.exception1.InvalidInputException;

public class CapitalizeFirstAndLastWordTest {

	
	CapitalizeFirstAndLastWord capitalizeWord=new CapitalizeFirstAndLastWord();
	
	@Test
	public void shouldReturnUpdatedStringIfGivenStringIsNotNull()
	{
		String actualString=capitalizeWord.convertFirstAndLastLetterOfWordInLine("divya walgude");
		assertEquals("DivyA WalgudE ", actualString);
	}
	
	@Test
	public void shouldReturnResultStringIfFirstAndLastLetterConvertedSuccefully()
	{
		String actualString=capitalizeWord.convertFirstAndLastLetterOfWordInLine("divya walgude");
		assertEquals("DivyA WalgudE ", actualString);
	}
	
	@Test(expected = InvalidInputException.class)
	public void shouldReturnthrowExceptionIfGivenStringIsNull()
	{
		capitalizeWord.convertFirstAndLastLetterOfWordInLine(null);
	}
	
	@Test(expected = InvalidInputException.class)
	public void shouldReturnthrowExceptionIfGivenStringIsEmpty()
	{
		capitalizeWord.convertFirstAndLastLetterOfWordInLine("");
	}
}
