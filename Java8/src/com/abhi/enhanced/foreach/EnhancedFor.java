package com.abhi.enhanced.foreach;

import java.util.ArrayList;

public class EnhancedFor {
	public static void main(String args[]) {
		// --------------------------------------For each for int
		System.out.println("---------------Enhanced For loop for int-------------------");
		int arr[] = { 12, 13, 14, 44 };
		// traversing the array with for-each loop
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("-------------Enhaloopnced For loop for String---------------------");

		// ------------------------------------For each for String
		String str[] = { "Hello", "Pello", "Mello", "Lelo", "Kello" };
		for (String i : str) {
			System.out.println(i);
		}
		System.out.println("-------------Enhance for loop for total--------------------");

		// ------------------------------------Getting total number
		int arr2[] = { 12, 13, 14, 44 };
		int total = 0;
		for (int i : arr2) {
			total = total + i;
		}
		System.out.println("Total: " + total);
		System.out.println("-----------For Each forenhanced for loop for collection-----------------------");

		// -------------------------------------For each for collection
		// Creating a list of elements
		ArrayList<String> list = new ArrayList<String>();
		list.add("vimal");
		list.add("sonoo");
		list.add("ratan");
		// traversing the list of elements using for-each loop
		for (String s : list) {
			System.out.println(s);
		}

	}
}
