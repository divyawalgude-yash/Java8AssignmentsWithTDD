package com.java8.assignment2;

public class FindLeadersInArray {

	public int[] findLeaders(int[] arr) {

		if (arr != null) {
			int[] resultArray = new int[arr.length];

			int count = 0;
			resultArray[count++] = arr[arr.length - 1];
			for (int i = arr.length - 1; i >0; i--) {
				if (arr[i-1] > arr[i]) {
					resultArray[count++] = arr[i-1];
				}
			}
			return resultArray;
		} else {
			throw new NullPointerException();
		}
	}
}
