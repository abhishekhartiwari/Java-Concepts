package com.abhi.java8.other;

import java.util.ArrayList;
import java.util.List;

public class CheckOnYourOwn {
	

	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(0, 12);
		ls.add(1, 13);
		
		System.out.println(ls);
		for(int i : ls)System.out.println(i);
		ls.forEach(i -> System.out.println(i));
	}

}
