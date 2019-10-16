package com.java8.assignment1;

import java.util.List;
import java.util.stream.Collector;

import com.java8.exception1.InvalidInputException;

public class FindWrongNumberFromSeries {

	public int getWrongNumberFromList(Integer arr[]) {
		int wrongNumber = 0;

		if (arr != null) {
			for (int i = 0, j = 1; i < arr.length; i = i + 2, j = j + 2) {
				if (i + 2 < arr.length && arr[i] + 5 != arr[i + 2]) {
					wrongNumber = arr[i + 2];
					break;
				}

				if (j + 2 < arr.length && arr[j] + 10 != arr[j + 2]) {
					wrongNumber = arr[j + 2];
					break;
				}
			}
			return wrongNumber;
		} else {
			throw new NullPointerException();
		}

	}

}
