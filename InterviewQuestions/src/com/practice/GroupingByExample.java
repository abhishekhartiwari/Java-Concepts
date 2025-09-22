package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByExample {
	
	
	public static void main(String[] args) {
		
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Alice","Charlie", "Bob");
		System.out.println("Actual name: "+names);
		Set<String> set = new HashSet<>();
		Set<String> collect2 = names.stream().filter(n -> set.add(n)).collect(Collectors.toSet());//removed duplicate
		System.out.println("Removed Duplicate: "+collect2);
		
		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println("Frequency of names: "+collect); //frequncy
		
		List<Integer> list = Arrays.asList(1,4,6,3,11,7,3,5,3,2,3,1,2);
		Map<Integer, Long> collect3 = list.stream().collect(Collectors.groupingBy(l -> l, Collectors.counting()));
		System.out.println("Frequency of numbers from list: "+collect3);
	}

}
