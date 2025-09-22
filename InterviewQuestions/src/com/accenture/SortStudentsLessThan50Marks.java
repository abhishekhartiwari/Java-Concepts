package com.accenture;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class SortStudentsLessThan50Marks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 45),
            new Student("Bob", 65),
            new Student("John", 32),
            new Student("Mark", 50),
            new Student("Sara", 28),
            new Student("Binu", 38)
        );

        // Filter students with marks < 50 and sort them by marks ascending
        List<Student> lowScorers = students.stream()
            .filter(s -> s.getMarks() < 50)
            .sorted(Comparator.comparing(Student::getName))
            .collect(Collectors.toList());

        lowScorers.forEach(System.out::println);
    }
}
