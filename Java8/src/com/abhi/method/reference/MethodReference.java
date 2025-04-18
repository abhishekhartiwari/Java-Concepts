package com.abhi.method.reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void print(String s){
        System.out.println(s);
    }

    public void print2(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        List<String> students  = Arrays.asList("Alice", "Bob", "Charlie");
        // students.forEach(x -> System.out.println(x));
        //students.forEach(Test::print);
        MethodReference test = new MethodReference();
        students.forEach(test::print2);

    }
}
