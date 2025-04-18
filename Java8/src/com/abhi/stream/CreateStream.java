package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 8, 10, 55, 44, 99, 121, 500);
        Stream<Integer> liStream = list.stream();
        System.out.println(liStream.max((a, b) -> (a - b)).get());

        Integer[] array = { 1, 2, 3, 4, 55, 66, 77, 88 };
        Stream<Integer> arrayStream = Arrays.stream(array);
        System.out.println(arrayStream.count());

        Stream<Integer> streamOf = Stream.of(11, 22, 33, 44, 55, 666, 777);
        System.out.println(streamOf.min((a, b) -> a - b).get());

        List<Integer> iStream = Stream.iterate(0, n -> n + 1).limit(100).collect(Collectors.toList());
        System.out.println(iStream);

        List<String> gStream = Stream.generate(() -> "hello").limit(5).collect(Collectors.toList());
        System.out.println(gStream);

    }
}
