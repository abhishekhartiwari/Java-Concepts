package com.abhishek.JUnitComplexExample;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static Set<String> findDuplicatesUsingSet(List<String> names) {
        Set<String> uniqueNames = new HashSet<>();
        return names.stream()
            .filter(name -> !uniqueNames.add(name))
            .collect(Collectors.toSet());
    }

    public static Set<String> findDuplicatesUsingGrouping(List<String> names) {
        Map<String, Long> freq = names.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return freq.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
    }
}
