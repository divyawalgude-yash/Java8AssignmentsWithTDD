package com.java8.assignment2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSumOfEvenNumberFromArray {

	public Integer findSum(Integer[] arr)
	{
		if(arr!=null)
		{
			Stream<Integer> intStream = Stream.of(arr); 
			Integer sum=intStream.filter(s->s%2==0).collect(Collectors.summingInt(s->s));
			return sum;
			
		}else
		{
			throw new NullPointerException();
		}
	}
}
