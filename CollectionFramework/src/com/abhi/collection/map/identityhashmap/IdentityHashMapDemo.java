package com.abhi.collection.map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		String key1 = new String("Key");
		String key2 = new String("Key");
	
		HashMap<String, Integer> map = new HashMap<>();
		map.put(key1, 1);
		map.put(key2, 2);
		
		System.out.println(map); //{Key=2}
		
		//----------------------------------------------------------------------//
		
		IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
		
		identityHashMap.put(key1, 1);
		identityHashMap.put(key2, 2);
		
		System.out.println(identityHashMap); //{Key=1, Key=2}
	}

}
