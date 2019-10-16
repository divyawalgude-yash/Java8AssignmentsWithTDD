package com.java8.assignment1;

public class SpyNumber {

	public boolean CheckSpyNumber(Integer number) {
		int rem = 0, sum = 0, mul = 1;
		if (number != null) {

			while (number != 0) {
				rem = number % 10;
				sum = sum + rem;
				mul = mul * rem;
				number = number / 10;

			}
			return sum == mul;
		} else {
			return false;
		}

	}
}
