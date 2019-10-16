package com.java8.assignment1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java8.assignment1.ReplaceArrayListElement;
import com.java8.exception1.NumberNotFoundException;

public class ReplaceArrayListElementTest{

	ReplaceArrayListElement replaceElement=new ReplaceArrayListElement();
	
//	@Test
//	public void ShouldCheckUserInputAsInteger()
//	{
//		int userinput=10;
//		boolean result=replaceElement.replaceElement(userinput);
//		
//	}
	List<Integer>replaceList=new ArrayList<Integer>();
	List<Integer>actualList=new ArrayList<Integer>();

	@Before
	public void setUp()
	{
		
		replaceList.add(55);
		replaceList.add(6);
		replaceList.add(368);	
		
		actualList.add(55);
		actualList.add(25);
		actualList.add(368);
		
	}
	
	
	@Test
	public void ShouldReturnTrueIfUserInputIsNotNull()
	{
		Integer replaceNumber=25;
		Integer newNumber=6;
		List<Integer> result=replaceElement.replaceElement(replaceNumber,newNumber);
		assertEquals(replaceList, result);
		
	}
	
	@Test(expected = RuntimeException.class)
	public void ShouldReturnfalseIfnewNumberIsNull()
	{
		Integer replaceNumber=25;
		Integer newNumber=null;
		List<Integer> actuallist=replaceElement.replaceElement(replaceNumber,newNumber);

	}
	
	@Test(expected = RuntimeException.class)
	public void ShouldReturnfalseIfreplaceNumberIsNull()
	{
		Integer replaceNumber=null;
		Integer newNumber=6;
		List<Integer> actuallist=replaceElement.replaceElement(replaceNumber,newNumber);

	}
	
	@Test
	public void ShouldReturnTrueIfReplaceElementIsFoundInList()
	{
		Integer replaceNumber=25;
		Integer newNumber=6;
		List<Integer> result=replaceElement.replaceElement(replaceNumber,newNumber);
		assertNotNull(result);

	}
	
	@Test(expected = NumberNotFoundException.class)
	public void ShouldReturnTrueIfReplaceElementIsNotFoundInList()
	{
		Integer replaceNumber=10;
		Integer newNumber=6;
		List<Integer> result=replaceElement.replaceElement(replaceNumber,newNumber);
	}
	
	@Test
	public void ShouldReturnTrueIfNumberReplaceSuccefully()
	{
		Integer replaceNumber=25;
		Integer newNumber=6;
		List<Integer> actual=replaceElement.replaceElement(replaceNumber,newNumber);
		assertEquals(replaceList, actual);
	}
	
}
