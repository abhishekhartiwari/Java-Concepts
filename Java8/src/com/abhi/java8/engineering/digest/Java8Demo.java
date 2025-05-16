package com.abhi.java8.engineering.digest;

public class Java8Demo {

	public static void main(String[] args) {

		// streams
		// Why Java8 -> concise code, functional programming, lambda Expression,
		// Streams, Date Time API

		// LE -> LE is anonymous function (no name, no return type, no access modifier)
		// LE can be used to implement functional interface
		// Functional's interface reference can hold lambda expression

		// Thread t1 = new Thread(new Task());
		Thread t1 = new Thread(() -> {
			System.out.println("My thread");
		});
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("My thread");
	}
}
