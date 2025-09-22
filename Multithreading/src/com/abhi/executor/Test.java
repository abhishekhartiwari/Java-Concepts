package com.abhi.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads in pool

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is executing task");
        };

        // Submitting tasks
        for (int i = 0; i < 5; i++) {
            executor.submit(task);
        }

        executor.shutdown(); // Initiates shutdown
    }
}
