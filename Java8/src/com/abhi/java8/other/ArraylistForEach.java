package com.abhi.java8.other;
import java.util.*;

public class ArraylistForEach {

//Java Program Demonstrate forEach()
//method of ArrayList


	public static void main(String[] args)
	{
		// create an ArrayList which going to
		// contains a list of Numbers
		ArrayList<Integer> Numbers = new ArrayList<Integer>();

		// Add Number to list
		Numbers.add(23);
		Numbers.add(32);
		Numbers.add(45);
		Numbers.add(63);

		// forEach method of ArrayList and
		// print numbers
//		for(int i: Numbers) { System.out.println(i); }
		//working of both code are same
		Numbers.forEach((n) -> System.out.println(n));
		
	}
}
