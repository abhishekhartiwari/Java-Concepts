package com.abhi.collection.queue.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		System.out.println(pq); //always shortest element comes first, implementing minHeap DS
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		
		System.out.println("-----------------------------");
		Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
		pq2.offer(40);
		pq2.offer(12);
		pq2.offer(24);
		pq2.offer(36);
		System.out.println(pq2); //always shortest element comes first, implementing minHeap DS
		pq2.poll();
		System.out.println(pq2);
		System.out.println(pq2.peek());
	}

}
