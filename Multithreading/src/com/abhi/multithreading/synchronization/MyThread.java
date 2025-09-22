package com.abhi.multithreading.synchronization;

public class MyThread extends Thread{
	
	
	private Counter counter;
	public MyThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {


	//	Counter count = new Counter();
		for(int i =0; i<1000;i++) {
			
			
			counter.inctrement();
		}
	}

	
	
}
