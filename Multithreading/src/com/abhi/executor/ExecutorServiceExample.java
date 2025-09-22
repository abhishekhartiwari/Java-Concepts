package com.abhi.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(9);
		for (int i = 1; i <= 10; i++) {
			int finalI = i;
			Future<?> future = executorService.submit(() -> {

				long result = factorial(finalI);
				System.out.println(result);
			});
		}
		
		executorService.shutdown();
		try {
			executorService.awaitTermination(100, TimeUnit.SECONDS);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("total time taken:" + (System.currentTimeMillis() - startTime));

	}

	private static long factorial(int num) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int fact = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		return fact;
	}
}
