package com.abhi.java8.engineering.digest;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		//Predicate -> Functional Interface(Boolean valued function) will return true/false
		
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
				System.out.println(isEven.test(4));
				
				
		Predicate<String> isStartWithA = x -> x.toLowerCase().startsWith("a");
		Predicate<String> isEndWithK = x -> x.toLowerCase().endsWith("k");
		Predicate<String> and = isStartWithA.and(isEndWithK);
		
		System.out.println(isStartWithA.test("abhishek"));
		System.out.println(isEndWithK.test("AbhisheK"));
		System.out.println(and.test("abhishek"));
	}

}
