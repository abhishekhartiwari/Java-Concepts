package com.abhi.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		// first Example
		Consumer<String> printConsumer = str -> System.out.println(str);
		printConsumer.accept("Hello, Consumer!");

		// second example
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Consumer<String> printName = name -> System.out.println(name.toUpperCase());
		names.forEach(printName);

		// third example
		Consumer<String> firstConsumer = str -> System.out.println("First: " + str);
		Consumer<String> secondConsumer = str -> System.out.println("Second: " + str);
		Consumer<String> combinedConsumer = firstConsumer.andThen(secondConsumer);
		combinedConsumer.accept("Hello!");

	}
}
