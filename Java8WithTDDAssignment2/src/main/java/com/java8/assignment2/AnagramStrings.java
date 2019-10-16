package com.java8.assignment2;

import java.util.Arrays;

public class AnagramStrings {

	public boolean checkAnagramString(String firstString, String secondString) {

		if (firstString != null && secondString != null) {
			if (firstString.length() == secondString.length()) {

				char[] charArrayfirst = firstString.toLowerCase().toCharArray();
				char[] charArraySecond = secondString.toLowerCase().toCharArray();

				Arrays.sort(charArrayfirst);
				Arrays.sort(charArraySecond);
				if (Arrays.equals(charArrayfirst, charArraySecond)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			throw new NullPointerException();
		}

	}
}
