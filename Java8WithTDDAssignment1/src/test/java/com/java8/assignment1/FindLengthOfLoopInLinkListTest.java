package com.java8.assignment1;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.java8.assignment1.FindLengthOfLoopInLinkList;

public class FindLengthOfLoopInLinkListTest {

	FindLengthOfLoopInLinkList linkListLength = new FindLengthOfLoopInLinkList();

	@Test
	public void shouldReturnCountFromGivenListIfListContainLoop() {
		Node head = linkListLength.getNewNode(5);
		head.next = linkListLength.getNewNode(10);
		head.next.next = linkListLength.getNewNode(15);
		head.next.next.next = linkListLength.getNewNode(20);
		head.next.next.next.next = head.next;

		int excepetdCount = 3;
		int actualcount = linkListLength.getCountOfLinkList(head);
		assertEquals(excepetdCount, actualcount);

	}

	@Test
	public void shouldReturnZeroIfListDoNotContaineAnyLoop() {
		Node head = linkListLength.getNewNode(5);
		head.next = linkListLength.getNewNode(10);
		head.next.next = linkListLength.getNewNode(15);
		head.next.next.next = linkListLength.getNewNode(20);
		head.next.next.next.next = null;
		int excepetdCount = 0;
		int actualcount = linkListLength.getCountOfLinkList(head);
		assertEquals(excepetdCount, actualcount);

	}

	@Test
	public void shouldReturnZeroIfListIsNull() {

		int excepetdCount = 0;
		int actualcount = linkListLength.getCountOfLinkList(null);
		assertEquals(excepetdCount, actualcount);

	}

	@Test
	public void shouldReturnZeroIfListContainNextNodeIsNull() {
		Node head = linkListLength.getNewNode(5);
		head.next = null;
		int excepetdCount = 0;
		int actualcount = linkListLength.getCountOfLinkList(head);
		assertEquals(excepetdCount, actualcount);

	}

}
