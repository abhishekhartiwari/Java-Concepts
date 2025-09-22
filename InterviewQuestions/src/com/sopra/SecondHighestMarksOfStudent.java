package com.sopra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestMarksOfStudent {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Abhishek", 100), new Student("Harshit", 50),
				new Student("Mayank", 90));

		List<Student> collect = students.stream()
				.sorted(Comparator.comparing(Student::getMarks))
				//.sorted((s1, s2) -> s1.getMarks() - s2.getMarks())
				.skip(1)
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}

class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	String name;
	int marks;

	Student(String name, int marks) {

		this.name = name;
		this.marks = marks;

	}

}