package com.sopra;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> marks = Arrays.asList(22,10,44,50,60,100);
		
		Optional<Integer> second = marks.stream().distinct().sorted((a, b) -> a - b).skip(1).findFirst();
		System.out.println(second.get());
		
	}

}
