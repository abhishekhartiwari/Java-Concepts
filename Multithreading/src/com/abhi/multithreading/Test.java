package com.abhi.multithreading;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hello World!!");
		System.out.println(Thread.currentThread().getName());
		
		//Using Thread class
		Hello hello = new Hello();
		hello.start();
		
		//Using Runnable interface
		World ww = new World();
		Thread t = new Thread(ww);
		
		t.start();
		
	}

}

class Hello extends Thread{
	
	public void run() {
		System.out.println("Thread is running." +" " + Thread.currentThread().getName());
	}
}

class World implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running using runnable"+" " + Thread.currentThread().getName());
		
		
	}
	
}
