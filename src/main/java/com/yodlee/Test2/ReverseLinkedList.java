package com.yodlee.Test2;

import java.util.LinkedList;

public class ReverseLinkedList {
public static void main(String[] args) {
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	linkedList.add(4);
	linkedList.add(41);
	linkedList.add(14);
	linkedList.add(24);
	LinkedList<Integer> linkedListrevers = new LinkedList<Integer>();

	linkedList.descendingIterator().forEachRemaining(linkedListrevers::add);
	System.out.println(linkedListrevers);
}
}
