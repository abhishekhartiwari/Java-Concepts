package com.practice.groupbydepartment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	
	String name;
    String department;
    double salary;
    
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
    
    public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee ["+name+":"+department+"]";
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "Engineering", 90000),
			    new Employee("Bob", "Marketing", 70000),
			    new Employee("Charlie", "Engineering", 95000),
			    new Employee("Diana", "HR", 60000)
			);
		
		Map<String, Long> collect = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		
		System.out.println(collect);
		//collect.forEach((dept, emps) -> System.out.println(dept + " : "+ emps.size()));

	}

}
