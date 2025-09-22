package com.abhi;
import java.util.*;

class Student implements Comparable<Student> {
    Integer rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo; // natural order: rollNo
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        //return s1.rollNo-s2.rollNo;
    	return s1.name.compareTo(s2.name);
    }
}

class RollNumberComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.rollNo-s2.rollNo;

    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Aharlie"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        System.out.println("Sort by rollNo (Comparable):");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Sort by name (Comparator):");
        Collections.sort(list, new NameComparator());
        System.out.println(list);
        
        System.out.println("Sort by roll number (Comparator):");
        Collections.sort(list, new RollNumberComparator());
        System.out.println(list);
    }
}
