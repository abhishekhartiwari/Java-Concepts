package com.abhi.functional.interfaces;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello World !!");

		ThirdClass t = () -> System.out.println("Hiiiii !!");

		System.out.println(t);
	}
}

interface SecondClass {
	void sayHello();

	void sayBye();
}

@FunctionalInterface
interface ThirdClass {
	void sayHi();
}