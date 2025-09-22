package com.abhi.multithreading.methods;

public class YeildExample {

	public static void main(String[] args) {

		Runnable task = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
				Thread.yield(); // Suggests that this thread can pause
			}
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();
	}

}
