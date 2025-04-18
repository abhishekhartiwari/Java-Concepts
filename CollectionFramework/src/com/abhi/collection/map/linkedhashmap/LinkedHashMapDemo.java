package com.abhi.collection.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Orange", 10);
		map.put("Apple", 6);
		map.put("Grape", 9);
		map.put("Mango", 3);
		
		System.out.println(map);
		
		
		for (Entry<String, Integer> s : map.entrySet()) {
			
			System.out.println(s.getKey() + " "+ s.getValue());
			
		}

	}

}
