package com.abhi.java8.engineering.digest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {

		//Collectors is utility class like Arrays
		
		
		//collection to list
		List<String> names = Arrays.asList("Abhishek", "Pooja", "Neha", "Amit", "Pooja");
		List<String> list = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println(list);
		
		//collection to set
		List<Integer> numbers = Arrays.asList(1,2,3,4,2,4,6,8,9);
		Set<Integer> num = numbers.stream().collect(Collectors.toSet());
		System.out.println(num);
		
		//collection to a specific collection
		names.stream().collect(Collectors.toCollection(() -> new ArrayList<Object>() ));
		
		
		//joining string
		
		String collect = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		System.out.println(collect);
		
		//Sumarizing data
		List<Integer> numb = Arrays.asList(1,2,3,5,7,4);
		IntSummaryStatistics stats = numb.stream().collect(Collectors.summarizingInt(x -> x));
	
		System.out.println("Count: "+stats.getCount());
		System.out.println("Max: "+stats.getMax());
		System.out.println("Min: "+stats.getMin());
		System.out.println("Avg: "+stats.getAverage());
		System.out.println("Sum: "+stats.getSum());
	}

}
