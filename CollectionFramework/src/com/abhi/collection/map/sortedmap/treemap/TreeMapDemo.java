package com.abhi.collection.map.sortedmap.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {


		//SortedMap<Integer, String> sortedMap = new TreeMap<>();
		SortedMap<Integer, String> sortedMap = new TreeMap<>((o1, o2) -> o2-o1 );
		
		sortedMap.put(91, "Ketan");
		sortedMap.put(78, "Vishnu");
		sortedMap.put(88, "Nisha");
		
		System.out.println(sortedMap);
		
		System.out.println(sortedMap.firstKey());
		System.out.println(sortedMap.lastKey());
		System.out.println(sortedMap.headMap(88));
	}

}
