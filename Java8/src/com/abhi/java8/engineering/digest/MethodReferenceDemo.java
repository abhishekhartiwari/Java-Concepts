package com.abhi.java8.engineering.digest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		//We can use method without invoking it and in the place of lambda expression
		
		List<String> students = Arrays.asList("Ram", "Shyam", "Ganshyam");
		//students.forEach(x -> System.out.println(x));
		students.forEach(System.out::println);  //using method reference
	
		List<String> phones = Arrays.asList("A", "B", "C");
		phones.stream().map(MobilePhones::new).collect(Collectors.toList());
		
	
	}

}

class MobilePhones{
	
	String name;

	public MobilePhones(String name) {
		
		super();
		System.out.println("Creating class object");
		this.name = name;
	}
	
	
}
