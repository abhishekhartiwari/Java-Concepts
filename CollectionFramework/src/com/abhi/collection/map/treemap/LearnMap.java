package com.abhi.collection.map.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
	
		Map<String, Integer> map = new TreeMap<>();

		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 3);
		
//		if(!map.containsKey("Three")) {
//			map.put("Three", 33);
//		}
		
//		map.putIfAbsent("Three", 33);
	
		System.out.println(map);
		System.out.println("-------------------------");

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e);
		}
		System.out.println("-------------------------");
		
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
		}
		System.out.println("-------------------------");
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getValue());
		}
	}

}


