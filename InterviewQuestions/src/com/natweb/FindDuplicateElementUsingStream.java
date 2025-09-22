package com.natweb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementUsingStream {
	
	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("Alice", "Bob", "Charls", "Alice", "Bob");
		
		System.out.println(names);
		
		Set<String> storeUniqueElement = new HashSet<>();
		
		Set<String> collect = names.stream().filter(v -> storeUniqueElement.add(v)).collect(Collectors.toSet());
		System.out.println("set of unique names:"+collect);
		
		
		
		//-----------------------
		
		Map<String, Long> frequency = names.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(frequency);
		
		List<String> collect2 = frequency.entrySet().stream().filter(f -> f.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());
	
		System.out.println(collect2);
	}
	
	

}
