package com.abhi.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {


		List<Student> students = new ArrayList<>();
 		
		Student s1 = new Student(2, "Zami");
		Student s2 = new Student(5, "Kanak");
		Student s3 = new Student(1, "Manu");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Collections.sort(students);
		
		System.out.println(students);
		
	}

}
