package com.abhi.collection.list.vector;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		//Vector<Integer> v = new Vector<>();
		//Vector<Integer> v = new Vector<>(5); // this will double the size
		Vector<Integer> v = new Vector<>(5,2); // this will increment by 2
		
		v.add(2);
		v.add(1);
		v.add(30);
		v.add(5);
		v.add(9);
		v.add(23);
		
		System.out.println(v.capacity());
		
		System.out.println(v);
		
	}

}
