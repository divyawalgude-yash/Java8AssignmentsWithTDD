package com.java8.assignment1;

import com.java8.exception1.InvalidInputException;

public class CapitalizeFirstAndLastWord {

	public String convertFirstAndLastLetterOfWordInLine(String inputString) {
		String resutString = "";
		if (inputString == null || inputString.equals("")) {
			throw new InvalidInputException("Invalid Input");
		} else {
			String[] stringArr = inputString.split(" ");
			for (String eachWord : stringArr) {
				resutString = resutString + eachWord.substring(0, 1).toUpperCase()
						+ eachWord.substring(1, eachWord.length() - 1)
						+ eachWord.substring(eachWord.length() - 1, eachWord.length()).toUpperCase()+" ";
			
			}

			return resutString;

		}
	}
}
