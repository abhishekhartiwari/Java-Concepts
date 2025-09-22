package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//get student who get less than 50 marks and then sort them by name
public class SortStudentOnMarks50 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Alice", 45), 
				new Student("Bob", 65),
				new Student("John", 32), 
				new Student("Mark", 50), 
				new Student("Sara", 28),
				new Student("Binu", 38));
		
		
		List<Student> collect = students.stream()
				.filter(s -> s.getMarks() < 50)
				//.sorted((s1, s2) ->s1.getName().compareTo(s2.getName()))
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		
		System.out.println(collect);

	}

}

class Student {



	private String name;
	private int marks;

	Student(String name, int marks) {

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
		return "Student ["+name+":"+marks+"]";
	}
}
