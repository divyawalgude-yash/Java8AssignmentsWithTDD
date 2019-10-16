package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java8.assignment1.FindNextNumberFromSeries;
import com.java8.exception1.InvalidInputException;

public class FindNextNumberFromSeriesTest {

	FindNextNumberFromSeries numberSeries = new FindNextNumberFromSeries();

	List<Integer> inputList = new ArrayList<Integer>();
	List<Integer> origanalList = new ArrayList<Integer>();
	

	@Before
	public void setUp() {
		inputList.add(7);
		inputList.add(11);
		inputList.add(8);
		inputList.add(12);
		inputList.add(9);
		inputList.add(13);
		
		origanalList.add(7);
		origanalList.add(11);
		origanalList.add(8);
		origanalList.add(12);
		origanalList.add(9);


	}

	@Test
	public void shouldReturnCheckGivenArrayListInNotEmpty() {
		List<Integer> expectedList=new ArrayList<Integer>();
		expectedList.add(7);
		expectedList.add(11);
		expectedList.add(8);
		expectedList.add(12);
		expectedList.add(9);
		expectedList.add(13); 
		expectedList.add(10);
		List<Integer>actualList=numberSeries.getNextNumberFromSeries(inputList);
		assertEquals(expectedList, actualList);
	}

	@Test(expected = InvalidInputException.class)
	public void shouldReturnCheckGivenArrayListIsEmpty() {
		numberSeries.getNextNumberFromSeries(new ArrayList<Integer>());
	}

	@Test
	public void shouldReturnCheckGivenArrayListFindNextNumberSuccefully() {
	
		List<Integer> expectedList=new ArrayList<Integer>();
		expectedList.add(7);
		expectedList.add(11);
		expectedList.add(8);
		expectedList.add(12);
		expectedList.add(9);
		expectedList.add(13); 
		List<Integer>actualList=numberSeries.getNextNumberFromSeries(origanalList);
		assertEquals(expectedList, actualList);

	}

}
