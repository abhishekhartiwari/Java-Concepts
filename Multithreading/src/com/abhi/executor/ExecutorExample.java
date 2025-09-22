package com.abhi.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {

        // 1. Create an ExecutorService with a fixed thread pool of 3 threads.
        // This is your thread pool, ready to execute tasks.
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Submit 5 tasks to the executor.
        // The executor will pick up these tasks and assign them to its threads.
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on thread: " + Thread.currentThread().getName());
            });
        }

        // 3. Shut down the executor.
        // This tells the executor to stop accepting new tasks and to shut down
        // the threads once all submitted tasks are completed.
        executor.shutdown();
    }
}