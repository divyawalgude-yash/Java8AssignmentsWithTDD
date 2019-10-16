package com.java8.assignment2;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoubleTonClassTest {


	
	@Test
	public void ShouldCheckDoubleTonObject()
	{
		DoubleTonClass obj1 = DoubleTonClass.getInstance();
		DoubleTonClass obj2 = DoubleTonClass.getInstance();
		DoubleTonClass obj3 = DoubleTonClass.getInstance();
		assertThat(obj2.hashCode(), anyOf(is(obj1.hashCode()), is(obj3.hashCode())));
	}
}
