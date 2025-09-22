package com.sopra;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestMarksOfStudent {
	
	    public static void main(String[] args) {
	        List<Integer> marks = Arrays.asList(85, 92, 75, 92, 88, 75, 95, 95);

	        Optional<Integer> secondHighest = marks.stream()
	                .distinct() // Remove duplicates
	                .sorted((a, b) -> b - a) // Sort in descending order
	                .skip(1) // Skip the first (highest)
	                .findFirst(); // Get the second highest

	        if (secondHighest.isPresent()) {
	            System.out.println("Second highest marks: " + secondHighest.get());
	        } else {
	            System.out.println("No second highest marks found.");
	        }
	    }
	}

