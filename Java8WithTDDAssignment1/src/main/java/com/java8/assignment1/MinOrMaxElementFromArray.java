package com.java8.assignment1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinOrMaxElementFromArray {

	public Map<String, Integer> getMinMaxFromGivenArray(Integer[] arr) {

		int length=0;
		Map<String,Integer> elementMap=new HashMap<String,Integer>();
		
		if(arr!=null)
		{
			Arrays.sort(arr);
			length=arr.length;
			elementMap.put("min", arr[0]);
			elementMap.put("max", arr[length-1]);
		}else
		{
		  throw	new NullPointerException();
		}
		return elementMap;
	}
}