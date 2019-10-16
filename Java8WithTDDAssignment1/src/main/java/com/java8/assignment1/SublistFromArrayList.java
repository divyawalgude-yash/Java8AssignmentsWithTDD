package com.java8.assignment1;

import java.util.ArrayList;
import java.util.List;

public class SublistFromArrayList {

	
	public List<Integer> getSubListFromArrayList(List<Integer> originalList,Integer fromIndex, Integer toIndex)
	{
		if(fromIndex!=null && toIndex!=null)
		{
		List<Integer> subList=new ArrayList<Integer>();
		
		subList=originalList.subList(fromIndex, toIndex);
		
		return subList;
		}else
		{
			throw new NullPointerException();
		}
	}
}
