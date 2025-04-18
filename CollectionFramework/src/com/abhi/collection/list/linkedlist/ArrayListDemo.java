package com.abhi.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(7);
		list.add(17);
		list.add(20);
		
		list2.add(100);
		list2.add(500);
		list2.add(150);
		
		System.out.println(list);
		list.add(1, 55);
		System.out.println("-----------------------");
		System.out.println(list);
		System.out.println("-----------------------");
		list.set(0, 11);
		System.out.println(list);
		System.out.println(list.contains(171));
		System.out.println(list.addAll(list2));
		System.out.println("-----------------------");
		System.out.println(list);
		System.out.println("----------remove-------------");
		System.out.println(list.remove(5));
		System.out.println(list);
		System.out.println("----------for loop-------------");
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------for each loop-------------");
		for (Integer integer : list) {
			
			System.out.println(integer);
		}
		System.out.println("----------iterator-------------");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {	
			
			System.out.println(it.next());
		}
		
		
	}

}
