package com.abhi.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<Integer> submit = newSingleThreadExecutor.submit(() -> 23);
		System.out.println(submit.get());
	}

}
