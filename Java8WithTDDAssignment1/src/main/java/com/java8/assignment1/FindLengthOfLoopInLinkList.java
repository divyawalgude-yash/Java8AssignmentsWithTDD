package com.java8.assignment1;

import java.util.LinkedList;


class Node {

	public int data;
	public Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}
public class FindLengthOfLoopInLinkList {

	public int getCountOfLinkList(Node list) {

		Node slow = list, fast = list, temp = null;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return countNodesFormList(slow);
		}
		return 0;
	}

	public int countNodesFormList(Node n) {
		int res = 1;
		Node temp = n;
		while (temp.next != n) {
			res++;
			temp = temp.next;
		}
		return res;
	}

	public Node getNewNode(int key) {
		Node temp = new Node(key);
		temp.next = null;
		return temp;

	}

}
