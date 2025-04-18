package com.abhi.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> fun = a -> a.length();
		System.out.println(fun.apply("Abhishek"));

		Function<String, String> fun2 = a -> a.toUpperCase();
		System.out.println(fun2.apply("Abhishek"));

		Function<String, String> fun3 = a -> a.substring(0, 4);
		System.out.println(fun3.apply("Abhishek"));

		Function<String, String> foo = fun2.andThen(fun3);
		System.out.println(foo.apply("Abhishek"));

		Function<Integer, Integer> fun4 = a -> 2 * a;
		Function<Integer, Integer> fun5 = a -> a * a * a;
		System.out.println(fun4.andThen(fun5).apply(2)); // 64
		System.out.println(fun5.andThen(fun4).apply(2)); // 16
	}
}
