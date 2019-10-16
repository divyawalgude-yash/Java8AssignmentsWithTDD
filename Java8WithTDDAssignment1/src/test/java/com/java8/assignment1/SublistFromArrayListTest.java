package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java8.assignment1.SublistFromArrayList;

public class SublistFromArrayListTest {

	
	SublistFromArrayList subListFromArrayList=new SublistFromArrayList();
	List<Integer> originalList=new ArrayList<Integer>();
	
	@Before
	public void setUp()
	{
		originalList.add(3);
		originalList.add(6);
		originalList.add(10);
		originalList.add(4);
		originalList.add(7);
		originalList.add(9);

	}
	
	@Test(expected = NullPointerException.class)
	public void ShouldReturnThrowIfFromIndexIsNull()
	{
		Integer fromIndex=null;
		Integer toIndex=4;
		subListFromArrayList.getSubListFromArrayList(new ArrayList<Integer>(), fromIndex, toIndex);
	}
	
	@Test(expected = NullPointerException.class)
	public void ShouldReturnThrowIfToIndexIsNull()
	{
		Integer fromIndex=2;
		Integer toIndex=null;
		subListFromArrayList.getSubListFromArrayList(new ArrayList<Integer>(), fromIndex, toIndex);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldReturnThrowGivenArrayListIsEmpty()
	{
		Integer fromIndex=2;
		Integer toIndex=4;
		subListFromArrayList.getSubListFromArrayList(new ArrayList<Integer>(), fromIndex, toIndex);
	}
	
	@Test
	public void shouldReturnSubListFromGivenList()
	{
		Integer fromIndex=2;
		Integer toIndex=4;
		List<Integer> expectedSubList=new ArrayList<Integer>();
		expectedSubList.add(10);
		expectedSubList.add(4);

		List<Integer>actualList=subListFromArrayList.getSubListFromArrayList(originalList, fromIndex, toIndex);
		assertEquals(expectedSubList, actualList);
		
	}
}
