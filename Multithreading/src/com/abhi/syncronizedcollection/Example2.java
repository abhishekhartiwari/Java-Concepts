package com.abhi.syncronizedcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> notSafe = new ArrayList<>();
		long start1 = System.currentTimeMillis();
		runThreads(notSafe, "Unsafe List");
		System.out.println("Time1 :" + (System.currentTimeMillis() - start1));
		System.out.println(notSafe.size());
		 
		List<Integer> threadSafe =Collections.synchronizedList(new ArrayList<>());
		long start2 = System.currentTimeMillis();
		runThreads(threadSafe, "safe List");
		System.out.println("Time2 :" + (System.currentTimeMillis() - start2));
		System.out.println(threadSafe.size());
				
	}
	
	private static void runThreads(List<Integer> list, String string) throws InterruptedException {

		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		Runnable rn = () -> {
			for(int i=0; i<1000;i++) {
				list.add(i);
			}
		};
		
		ex.submit(rn);
		ex.submit(rn);
		
		ex.shutdown();
		ex.awaitTermination(1, TimeUnit.MINUTES);
	}



}
