package com.abhi.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(2);
		list.add(12);
		list.add(10);
		list.add(6);
		list.add(6);
		
		System.out.println(list);
		
		System.out.println("Min: "+Collections.min(list));
		System.out.println("Max: "+Collections.max(list));
		System.out.println("Frequency: "+Collections.frequency(list, 6));
		
		Collections.sort(list);
		System.out.println(list.reversed());
		
		//Collections.sort(list, Comparator.reverseOrder());

	}

}
