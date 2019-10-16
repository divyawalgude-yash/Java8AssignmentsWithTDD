package com.java8.assignment2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapObjectByValue {

	public Map<String, Integer> sortMapByValue(Map<String, Integer> inputMap) {

		if(inputMap!=null)
		{
		LinkedList<Map.Entry<String, Integer>> entrySet = new LinkedList<Map.Entry<String, Integer>>(
				inputMap.entrySet());
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> c1, Entry<String, Integer> c2) {
				// TODO Auto-generated method stub
				return c1.getValue().compareTo(c2.getValue());
			}
		};
		Collections.sort(entrySet, comparator);

		for (Map.Entry<String, Integer> entry : entrySet) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		}else
		{
			throw new NullPointerException();
		}
	}
}
