package com.abhi.java8.other;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsumerClass implements Consumer<Integer>{ //Here Consumer interface is a functional interface which have only one method "accept()"
	public void accept(Integer i) {
		System.out.println(i);
	}
}*/

public class DemoForEach {
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(4,5,6,7,8,9);
		//System.out.println(ls);
		
		/*
		 * for(int i =0; i<ls.size();i++) { System.out.println(ls.get(i)); }
		 */

		
		/*
		 * for(int i: ls) { System.out.println(i); }
		 */
		
		//If we are declaring a class and implementing the interface and define the method the we have to do below code for accessing the values
		//Consumer cc = new ConsumerClass();
		//ls.forEach(cc);
		
		//If we are not declaring a class then we can use anonymous inner class for same functionality
		/*
		 * Consumer<Integer> cc = new Consumer<Integer>() { 
		 * public void accept(Integer i){ 
		 * System.out.println(i); }
		 * 
		 * }; 
		 * ls.forEach(cc);
		 */
		
		//without using implemention of class or anobymous class, we are using below lambda expression
		//Consumer<Integer> cc = (i) -> System.out.println(i);
		//ls.forEach(cc);
		
		//More short, by using forEach method & LE together, forEach method should have consumer type argument
		//ls.forEach((i) -> System.out.println(i));
		ls.forEach(System.out::println);
		
	}

}
