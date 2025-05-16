package com.abhi.java8.engineering.digest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		 	Consumer<Integer> c = x -> System.out.println(x);
		 	
		 	c.accept(11);
		 	
		 	List<Integer> li = Arrays.asList(2,4,6);
		 	Consumer<List<Integer>> co = x -> {
		 		for (Integer integer : li) {
					
		 			System.out.println(integer);
				}
		 	};
		 	
		 	co.accept(li);
	}	

}
