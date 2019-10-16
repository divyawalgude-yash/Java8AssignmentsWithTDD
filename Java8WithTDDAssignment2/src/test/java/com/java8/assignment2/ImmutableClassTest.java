package com.java8.assignment2;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutableClassTest {

	@Test
	public void testImmutableClass() {
		ImmutableClass immutableClass = ImmutableClass.getInstance(10);
		assertEquals(10, immutableClass.getVal());
	}
}
