package com.java8.assignment2;

import java.io.Serializable;

public class SingleTonClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTonClass singletonObject;

	private SingleTonClass() {

	}

	public static SingleTonClass getInstance() {
		if (singletonObject == null) {
			synchronized (SingleTonClass.class) {
				if (singletonObject == null) {
					singletonObject = new SingleTonClass();
				}
			}
		}
		return singletonObject;
	}

	protected Object readResolve() {
		return singletonObject;
	}
}
