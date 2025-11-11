package com.natweb;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FindDuplicateElementInList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "John", "Alice", "Mark", "John");

        
        
        Set<String> uniqueNames = new HashSet<>();

        Set<String> duplicates = names.stream()
            .filter(name -> uniqueNames.add(name)) // `add` returns false if already exists
            .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    
        System.out.println("======================");
        Map<String, Long> freq = names.stream()
        	    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("freq: " + freq);
        
        Set<String> d = freq.entrySet().stream()
        	    .filter(e -> e.getValue() > 1)
        	    .map(Map.Entry::getKey)
        	    .collect(Collectors.toSet());
        
        System.out.println("dd: " + d);
        
    }
    
    
    
    

    
   
}