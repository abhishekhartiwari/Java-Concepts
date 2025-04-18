package com.abhi.collection.list.stack;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {

		
		Stack<Integer> li = new Stack<>();
		
		li.push(10);
		li.push(1);
		li.push(13);
		li.push(111);
		li.add(22);
		
		System.out.println(li);
		System.out.println(li.peek()); //LIFO, which element will pick from stack?
		li.pop();
		System.out.println(li);
		
	}

}
