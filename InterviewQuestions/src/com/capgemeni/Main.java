package com.capgemeni;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

	int id;
    String name;
    String designation;
    String gender;
    double salary;

    public Employee(int id, String name, String designation, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getGender() {
        return gender;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 2500000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 1500000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 2000000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 2500000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 1500000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 1500000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 1500000));

        // Group by designation -> gender -> count
        
//        Map<String, List<Employee>> byDesignation = employeesList.stream().collect(Collectors.groupingBy(Employee::getDesignation));
//        System.out.println(byDesignation);
        Map<String, Map<String, Long>> result =
                employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(result);
    }
}