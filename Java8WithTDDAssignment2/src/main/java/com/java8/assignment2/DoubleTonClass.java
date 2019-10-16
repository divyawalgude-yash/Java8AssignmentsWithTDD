package com.java8.assignment2;

public class DoubleTonClass {

	private static int count = 0;

	private static DoubleTonClass instance = null;

	private DoubleTonClass() {
	}

	public static DoubleTonClass getInstance() {
		if (count < 2) {
			System.out.println("count*** " + count);
			synchronized (DoubleTonClass.class) {
				if (count < 2) {
					instance = new DoubleTonClass();
				}
				count++;
				instance = new DoubleTonClass();
			}
		}
		return instance;
	}

}
