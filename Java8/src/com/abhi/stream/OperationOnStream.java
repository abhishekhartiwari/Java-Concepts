package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationOnStream {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 9, 22, 4, 34, 66, 7, 10, 3, 0, 5, 2);

        List<Integer> filteredList = list.stream()
                .filter(n -> n % 2 == 0)
                .map(a -> a / 2)
                .distinct()
                .sorted((a, b) -> (b - a))              //.peek(x->System.out.println(x))
                .limit(4)                       //.peek(System.out::println) //min //max //count //get
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(filteredList);

    }
}
