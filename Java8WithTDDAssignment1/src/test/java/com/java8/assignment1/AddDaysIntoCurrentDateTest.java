package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import com.java8.assignment1.AddDaysIntoCurrentDate;

public class AddDaysIntoCurrentDateTest {

	AddDaysIntoCurrentDate addDaysIntoDate=new AddDaysIntoCurrentDate();
			
	@Test(expected = NullPointerException.class)
	public void shouldReturnCheckGivenDaysIsNull()
	{
		addDaysIntoDate.getDateWithAddGivenDays(null);
	}
	
	@Test
	public void shouldReturnCurrentDateWithAddingGivenDaysSuccessfully()
	{
	Long days=new Long(10);
	LocalDate exceptedDateWithDays=LocalDate.now().plusDays(days);
	LocalDate actualDate= addDaysIntoDate.getDateWithAddGivenDays(days);
	assertEquals(exceptedDateWithDays, actualDate);
	}
}
