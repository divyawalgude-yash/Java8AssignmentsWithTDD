package com.java8.assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumberInArray1 {

	public int findSecondHighestNumber(Integer[] arr) {
		int highestNumber = 0;
		if (arr != null) {
			Arrays.sort(arr);
			highestNumber = arr[arr.length - 2];
			return highestNumber;
		} else {
			throw new NullPointerException();
		}
	}
	
}
