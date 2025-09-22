package com.abhi.executor;

import java.sql.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFactorial {

	public static void main(String[] args) {

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 6; i++) {
			int finalI = i;

			newFixedThreadPool.submit(() -> {
				int fact = factorial(finalI);
				System.out.println(fact);
			});

		}
		
		newFixedThreadPool.shutdown();
		try {
			newFixedThreadPool.awaitTermination(100, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Time :" + (System.currentTimeMillis() - start));

	}

	public static int factorial(int num) {

		int result = 1;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= num; i++) {

			result = result * i;
		}

		return result;
	}
}
