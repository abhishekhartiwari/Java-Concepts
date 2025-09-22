package com.annonymous;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "hello";
		
		char a[] = name.toCharArray();
		String reverse = "";
		
	
		for(int i= a.length-1 ; i >=0; i--) {
			
			reverse += name.charAt(i);
		}
		
		System.out.println(reverse);
		
	}
}
