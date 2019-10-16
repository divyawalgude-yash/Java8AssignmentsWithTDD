package com.java8.factory;

import com.java8.abstractFactory.ComputerAbstractFactory;
import com.java8.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
