package com.abhi.collection.collections.compareobject;

import java.util.Objects;

public class Student implements Comparable<Student>{

	int rollno;
	String name;

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

	@Override
	public int compareTo(Student that) {

		return this.rollno - that.rollno;
	}
	
	

}
