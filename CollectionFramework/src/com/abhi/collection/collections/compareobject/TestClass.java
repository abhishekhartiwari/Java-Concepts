package com.abhi.collection.collections.compareobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {


		List<Student> listStudent = new ArrayList<>();
		
		listStudent.add(new Student(3, "Ram"));
		listStudent.add(new Student(2, "Shyam"));
		listStudent.add(new Student(7, "Amit"));
		listStudent.add(new Student(4, "Naman"));
		
		//Collections.sort(listStudent, Comparator<T>);
	
		
		Collections.sort(listStudent);
		
		System.out.println(listStudent);
		
		Collections.sort(listStudent, (o1,o2)->o1.name.compareTo(o2.name));
		System.out.println("sorting by student name");
		System.out.println(listStudent);

		//how compareTo works
		
		Student s1 = new Student(3, "Puneet");
		Student s2 = new Student(2, "Vineet");
		
		System.out.println(s2.compareTo(s1));
	}

}
