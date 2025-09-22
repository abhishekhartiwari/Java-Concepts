package com.annonymous;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	
	public static void main(String[] args) {
		
		
		String str = "Hello";
		
		Map<Character, Integer> frequency = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			
			frequency.put(c, frequency.getOrDefault(c, 0)+1);
		}
		
		System.out.println(frequency);
	}

}
