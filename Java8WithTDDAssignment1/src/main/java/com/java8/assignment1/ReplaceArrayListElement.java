package com.java8.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java8.exception1.NumberNotFoundException;

public class ReplaceArrayListElement {

	
	public List<Integer> replaceElement(Integer replaceNumber,Integer newNumber) {
		
		ArrayList<Integer>elementList=new ArrayList<Integer>();
		elementList.add(55);
		elementList.add(25);
		elementList.add(368);
		
		if(replaceNumber!=null && newNumber!=null)
		{
			if(elementList.contains(replaceNumber))
			{
				Collections.replaceAll(elementList, replaceNumber, newNumber);
				elementList.forEach(System.out::println);
				return elementList;
			}else
			{
				throw new NumberNotFoundException("Number Not Found");
			} 
		}else
		{
			throw new RuntimeException("Number Should Not Be Null");
		}
		}
}
