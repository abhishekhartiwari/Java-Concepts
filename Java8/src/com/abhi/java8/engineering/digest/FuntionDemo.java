package com.abhi.java8.engineering.digest;

import java.util.function.Function;

public class FuntionDemo {

	public static void main(String[] args) {
	
		Function<Integer, Integer> square = x -> x * x;
		Function<Integer, Integer> cube = x -> x * x * x;

		System.out.println(square.apply(2));
		System.out.println(cube.apply(2));
		
		System.out.println(square.andThen(cube).apply(2));
		System.out.println(square.compose(cube).apply(2));
		
		
		Function<Integer, Integer> identity = Function.identity();
		Integer apply = identity.apply(90);
		System.out.println(apply);
	}

}
