package com.abhi.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(3, "Ram"));
		students.add(new Student(2, "Shaym"));
		students.add(new Student(4, "Shiva"));

		System.out.println(students);
		
		//Collections.sort(students, new MyComparator());
		Collections.sort(students, (o1, o2) -> o2.id-o1.id);
		System.out.println(students);

	}

}

class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id-o2.id;
	}
	
}
