package com.abhi.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Akshit");
		map.put(2, "Neha");
		map.put(3, "Shubham");
		map.put(4, "Pooja");

		System.out.println(map.get(3));
		System.out.println(map.get(32));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Pooja"));
		
		Set<Integer> keySet = map.keySet();
		
		for (Integer i : keySet) {
			
			System.out.println(map.get(i));
			
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> e : entrySet) {
			
			System.out.println(e.getKey() +":"+ e.getValue());
			
		}
		
		map.remove(4);
		System.out.println(map);
//		if(!map.containsKey("Three")) {
//			map.put("Three", 33);
//		}
		
//		map.putIfAbsent("Three", 33);
	
//		System.out.println(map);
//		System.out.println("-------------------------");
//
//		for (Map.Entry<String, Integer> e : map.entrySet()) {
//			System.out.println(e);
//		}
//		System.out.println("-------------------------");
//		
//		for (Map.Entry<String, Integer> e : map.entrySet()) {
//			System.out.println(e.getKey());
//		}
//		System.out.println("-------------------------");
//		for (Map.Entry<String, Integer> e : map.entrySet()) {
//			System.out.println(e.getValue());
//		}
	}

}


