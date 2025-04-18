package com.abhi.collection.set.hashset.object;

import java.util.HashSet;
import java.util.Set;

public class HashSetForObject {

	public static void main(String[] args) {


		Set<Student> s = new HashSet<>();
		
		s.add(new Student(1, "Ram"));
		s.add(new Student(2, "Akhilesh"));
		s.add(new Student(3, "Nitesh"));
		s.add(new Student(2, "Ram"));
		
		
		Student s1 = new Student(2, "Ram");
		Student s2 = new Student(2, "Shyam");
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s);
	}

}
