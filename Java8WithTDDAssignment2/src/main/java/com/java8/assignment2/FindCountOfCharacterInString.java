package com.java8.assignment2;

public class FindCountOfCharacterInString {

	public String findCharacterInString(String inputString) {
		int count = 1;
		String temp = "";
		if (inputString != null) {

			for (int i = 0; i <= inputString.length() - 1; i++) {

				for (int j = i + 1; j <= inputString.length() - 1; j++) {

					if (inputString.charAt(i) == inputString.charAt(j)) {
						count++;
					}
				}
				if (!temp.contains("" + inputString.charAt(i)) && count > 1) {
					temp = temp + inputString.charAt(i) + count;
				}else if (!temp.contains("" + inputString.charAt(i))) {
					temp = temp + inputString.charAt(i);
				}
				count = 1;
			}
			return temp;

		} else {
			throw new NullPointerException();
		}
	}

}
