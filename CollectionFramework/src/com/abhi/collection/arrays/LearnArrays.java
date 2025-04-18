package com.abhi.collection.arrays;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,6,7,9,4};
		
		int index = Arrays.binarySearch(numbers, 6);
		System.out.println(index);
		
		Arrays.sort(numbers);
		
		for (int i : numbers) {
			System.out.println(i);
		}
		

	}

}
