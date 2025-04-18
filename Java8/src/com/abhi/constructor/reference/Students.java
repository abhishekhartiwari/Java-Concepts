package com.abhi.constructor.reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Students {

    String name;

    Students(String name){
        this.name = name;
    }

    
    @Override
    public String toString() {
        return "Students [name=" + name + "]";
    }


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<Students> list = names.stream().map(Students::new).collect(Collectors.toList());
        System.out.println(list);

    }
}
