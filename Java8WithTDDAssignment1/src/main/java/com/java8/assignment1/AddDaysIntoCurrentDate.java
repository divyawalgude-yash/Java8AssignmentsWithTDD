package com.java8.assignment1;

import java.time.LocalDate;

public class AddDaysIntoCurrentDate {

	
	public LocalDate getDateWithAddGivenDays(Long days)
	{
		LocalDate currentDate=LocalDate.now();
		if(days!= null)
		{
			currentDate=currentDate.plusDays(days);
			return currentDate;
		}else
		{
			throw new NullPointerException();
		}
		
	}
}
