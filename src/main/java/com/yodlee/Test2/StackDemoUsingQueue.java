package com.yodlee.Test2;

import java.util.LinkedList;
import java.util.Queue;

public class StackDemoUsingQueue {
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		push(4);
		push(5);
		push(6);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(top());
	}

	public static void push(int x) {
			q2.add(x);
			
			while(!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			//swap logic
			Queue<Integer> tempQ = q1;
			q1=q2;
			q2=tempQ;
	}

	public static int pop() {
		return q1.remove();
	}

	public static int top() {
		if (q1.isEmpty())
			return -1;
		else
			return q1.peek();
	}
}
