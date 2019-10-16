package com.java8.assignment1;

public class CountNumberOfVowelInString {

	public Integer getCountOfVowelFromString(String inputString) {
		Integer count = 0;
		if (inputString != null) {

			for (char ch : inputString.toCharArray()) {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.println(ch);
					count++;
				}
			}

			return count;
		} else {
			throw new NullPointerException();
		}
	}
}
