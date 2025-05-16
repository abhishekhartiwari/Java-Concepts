package com.abhi.java8.engineering.digest;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BiPredicateFunctionConsumer {

	public static void main(String[] args) {

		// BiPredicate
		BiPredicate<Integer, Integer> biP = (x, y) -> (x + y) % 2 == 0;
		System.out.println(biP.test(4, 6));

		// BiConsumer
		BiConsumer<Integer, Integer> biC = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		biC.accept(3, 12);

		
		//BiFunction
		BiFunction<String, String, Integer> biF = (x, y) -> (x + y).length();
		System.out.println(biF.apply("a", "bc"));
		
		//Function<Integer, Integer> square = x -> x * x;
		//if function's input type and return type both are same datatype then we can use below replacement.
		UnaryOperator<Integer> square = x -> x * x;
		
		//BiFunction<Integer, Integer, Integer> biFF = (x, y) -> (x + y).length();
		//if BiFunction accepts the same datatype which its going to return then below is the replacement.
		BinaryOperator<Integer> biFF = (x, y) -> (x + y);
	}

}
