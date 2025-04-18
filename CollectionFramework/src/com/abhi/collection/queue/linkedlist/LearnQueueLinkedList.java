package com.abhi.collection.queue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(10);
		q.offer(12);
		q.offer(1);
		q.offer(111);
		
		
		System.out.println(q);
		System.out.println(q.peek()); //FIFO, which element will pick from queue?
		System.out.println(q.poll()); 
		System.out.println(q);
		
		
		//offer() is same as add() but if add() successfully added the element then it returns
		//true otherwise throw an exception
		
		//peek() is same as element(),but if operation success then return true otherwise throw an exception
		
		//poll() is same as remove(), but if operation is not success then it throws an exception
	}

}
