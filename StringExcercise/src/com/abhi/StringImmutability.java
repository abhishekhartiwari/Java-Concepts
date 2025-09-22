package com.abhi;

public class StringImmutability {

	public static void main(String[] args) {
	
		
		String s1 = "Hello";
		String s11 = "Hello";
		String s2 = new String("Hello");
		String s22 = new String("Hello");
		
		//equals method check content and == operator check reference
		System.out.println(s1.equals(s11)); //true, checks content
		System.out.println(s2.equals(s22)); //true, checks content
		
		System.out.println(s1 == s11); // true, once "Hello" is stored in SCP it cannot create new object with same content
										// instead both s1 and s11 will refer same object, it stored in SCP
		
		System.out.println(s2 == s22); // false, new keyword always create a new object no matter if content is same or not, it stored in heap
		
		
		System.out.println(s1.equals(s2)); // true, equals method check content
		System.out.println(s1 == s2); // false, checking reference
		
		s1.concat("world");
		System.out.println(s1);// as per the code we can see we are not able to modify the string s1, so its immutable
		s2.concat("word");
		System.out.println(s2); // immutable
	}

}
