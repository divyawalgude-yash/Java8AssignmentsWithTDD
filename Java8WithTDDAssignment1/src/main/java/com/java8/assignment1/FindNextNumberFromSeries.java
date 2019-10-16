package com.java8.assignment1;

import java.util.List;

import com.java8.exception1.InvalidInputException;

public class FindNextNumberFromSeries {

	public List<Integer> getNextNumberFromSeries(List<Integer> inputList) {
		Integer firstDiff = 0, secondDiff = 0, temp = 0;

		if (!inputList.isEmpty()) {

			firstDiff = inputList.get(0) - inputList.get(1);
			secondDiff = inputList.get(1) - inputList.get(2);

			if ((inputList.size() - 1) % 2 != 0) {
				temp = inputList.get(inputList.size() - 1);
				inputList.add(temp - secondDiff);
			} else {
				temp = inputList.get(inputList.size() - 1);
				inputList.add(temp - (firstDiff));
			}
			return inputList;
		} else {
			throw new InvalidInputException("Invalid Input");
		}
	}

}
