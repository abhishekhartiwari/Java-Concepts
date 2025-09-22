package com.abhi.multithreading;

public class LifeCycleMethods {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("Main method");
		
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		
		Thread.sleep(100);
		System.out.println(t1.getState());
		
		t1.join();
		System.out.println(t1.getState());

		
		
	}

}

class MyThread extends Thread{

	@Override
	public void run() {

		System.out.println("RUNNING");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
