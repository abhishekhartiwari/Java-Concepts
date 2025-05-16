package com.abhi.java8.engineering.digest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		// introduced in Java 8
		// with the help of stream we will be able to process the collections in
		// functional and declarative manner
		// functional manner
		// simplify data processing
		// enable parallelism

		// how to use streams
		// source, intermediate operations and terminal operations

		List<Integer> list = Arrays.asList(1, 2, 3, 9);
		int count = 0;
		for (Integer integer : list) {

			if (integer % 2 == 0) {
				count++;
				System.out.println(integer);
			}
		}
		System.out.println("count of even number: " + count);

		System.out.println("count of event numbers : " + list.stream().filter(x -> x % 2 == 0).count());

		// creating stream, 5 ways , source--------------------------------------------------------------
		// 1. From collection
		Stream<Integer> stream = list.stream();

		// 2. From Arrays
		String[] array = { "a", "b", "c" };
		Stream<String> stream2 = Arrays.stream(array);

		// 3. using Stream.of
		Stream<Integer> stream3 = Stream.of(1, 2, 3, 7);

		// 4. infinite stream
		Stream<Integer> limit = Stream.generate(() -> 1).limit(20);
		Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);

		// intermediate operation----------------------------------------------------------------------
		// intermediate operation converts stream into other stream
		// they are lazy, means it will not execute until we apply terminal operation

		// 1. filter()
		List<String> names = Arrays.asList("Abhishek", "Pooja", "Neha", "Amit", "Pooja");
		Long count2 = names.stream().filter(x -> x.toLowerCase().startsWith("a")).count();
		System.out.println(count2);

		// 2. map()
		Stream<String> map = names.stream().map(x -> x.toUpperCase());
		//List<Integer> collect2 = names.stream().map(x -> x.length()).collect(Collectors.toList());
		List<Integer> collect2 = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Use of map to get the length of each element in the list: "+collect2);
		
		//2. flatmap()
		
		List<String> words = List.of("Hello", "World");
		List<String> collect3 = words.stream().flatMap(word -> Arrays.stream(word.split(""))).collect(Collectors.toList());
		System.out.println("Collect3 -----------"+collect3);

		// 3. sorted
		Stream<String> sorted1 = names.stream().sorted();
		Stream<String> sorted2 = names.stream().sorted((a, b) -> a.length() - b.length());

		// 4. distinct()
		long count3 = names.stream().filter(x -> x.startsWith("Pooja")).count();
		System.out.println("same name : " + count3);
		long count4 = names.stream().filter(x -> x.startsWith("P")).distinct().count();
		System.out.println("same name : " + count4);

		// 5. limit()
		Stream.iterate(1, x -> x + 1).limit(10);
		
		//

		// terminal operation-------------------------------------------------------------------------

		List<Integer> list2 = Arrays.asList(1, 3, 6, 8, 9);

		// 1. collect
		List<Integer> collect = list2.stream().skip(1).collect(Collectors.toList());
		System.out.println(collect);

		// 2. forEach
		System.out.println("for each method----");
		list2.stream().forEach(x -> System.out.println(x));
		
		//2.1 forEachodered
		System.out.println("for each odered method----");
		list2.stream().forEachOrdered(x -> System.out.println(x));

		// 3. reduce: combines the element to produce a single result
		Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
		System.out.println("reduce : " + reduce.get());

		// 4. count

		// 5. anyMatch. noneMatch, allMatch
		boolean anyMatch = list2.stream().anyMatch(x -> x % 2 == 0);
		System.out.println(anyMatch);

		boolean allMatch = list2.stream().allMatch(x -> x > 0);
		System.out.println(allMatch);

		boolean noneMatch = list2.stream().noneMatch(x -> x < 1);
		System.out.println(noneMatch);

		// 6. findFirst, findAny
		System.out.println(list2.stream().findFirst().get());
		System.out.println(list2.stream().findAny().get());

		// Example: filtering and collection
		List<String> asList = Arrays.asList("Annie", "Bob", "Charlie", "David");
		List<String> list3 = asList.stream().filter(x -> x.length() > 3).toList();
		System.out.println(list3);

		// Example: square and sorting
		List<Integer> asList2 = Arrays.asList(1, 2, 5, 6, 4);
		List<Integer> list4 = asList2.stream().map(x -> x * x).sorted().toList();
		System.out.println(list4);

		// Example summing values
		List<Integer> asList3 = Arrays.asList(1, 4, 5, 7);
		Optional<Integer> reduce2 = asList3.stream().reduce(Integer::sum);
		System.out.println("sum of lists numbers: " + reduce2.get());

		// Example: counting of occurrence
		String sentance = "Hello World";
		long count5 = sentance.chars().filter(x -> x == 'l').count();
		System.out.println(count5);
		
		//stateful and stateless operations
		//stream cannot be used after terminal operation has been called
		List<String> city = Arrays.asList("Allahabad", "Delhi", "Banaras", "Kanpur");
		Stream<String> stream4 = city.stream();
		stream4.forEach(System.out::println);
		stream4.map(String::toUpperCase);
		//stateful -  all the elements should be known prior to operation/operations
		//stateless - awareness of all the elements prior to operations is necessarily known
		
		
		//terminal methods min/max
		
		
	}

}
