package com.abhi.collection.queue.dqueue;

import java.util.ArrayDeque;

public class LearnDQueue {

	public static void main(String[] args) {

		ArrayDeque<Integer> dqueue = new ArrayDeque<>();

		dqueue.offer(23);
		dqueue.offerFirst(12);
		dqueue.offerLast(45);
		dqueue.offer(26);
		
		System.out.println(dqueue);
		System.out.println("------------peek------------");
		System.out.println(dqueue.peek());
		System.out.println(dqueue.peekFirst());
		System.out.println(dqueue.peekLast());
		
		System.out.println("poll === "+dqueue.poll());
		System.out.println("poll Last === "+dqueue.pollLast());
		System.out.println("poll First=== "+dqueue.pollFirst());
	}

}
