package com.abhi.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class LearnLinkedHashSet {

	public static void main(String[] args) {


		Set<Integer> set = new TreeSet<>(); //duplicate not allowed, sorted order
		
		set.add(12);
		set.add(34);
		set.add(2);
		set.add(43);
		set.add(7);
		
		System.out.println(set);
		System.out.println(set.remove(43));
		System.out.println(set);
		System.out.println(set.contains(33));
		System.out.println("isEmpty - "+set.isEmpty());
		System.out.println("size - "+set.size());

	}

}
