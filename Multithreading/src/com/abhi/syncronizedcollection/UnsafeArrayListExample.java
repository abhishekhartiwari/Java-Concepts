package com.abhi.syncronizedcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeArrayListExample {

    public static void main(String[] args) throws InterruptedException {
        // Step 1: Demonstrate the issue with a non-thread-safe ArrayList
        System.out.println("--- Demonstrating Thread-Unsafe ArrayList ---");
        List<Integer> unsafeList = new ArrayList<>();
        runThreads(unsafeList, "Unsafe List");

        // The final size of the list will likely be less than 2000 due to race conditions.
        // It may even throw a ConcurrentModificationException at runtime.
        System.out.println("Final size of the unsafe list: " + unsafeList.size());
        System.out.println("Expected size: 2000 (1000 from each thread)");
        System.out.println("----------------------------------------------\n");

        // Step 2: Show the solution using Collections.synchronizedList()
        System.out.println("--- Demonstrating Thread-Safe Synchronized List ---");
        // Create a thread-safe synchronized list by wrapping a new ArrayList
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        runThreads(synchronizedList, "Synchronized List");

        // The final size of the synchronized list will be exactly 2000.
        System.out.println("Final size of the synchronized list: " + synchronizedList.size());
        System.out.println("Expected size: 2000 (1000 from each thread)");
        System.out.println("----------------------------------------------");
    }

    /**
     * Helper method to run two threads that add numbers to a list.
     * @param list The list to be modified by the threads.
     * @param listName A name for the list, used for printing.
     * @throws InterruptedException if the main thread is interrupted while waiting.
     */
    private static void runThreads(List<Integer> list, String listName) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task for each thread: add 1000 integers to the list
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
            System.out.println(Thread.currentThread().getName() + " finished adding elements to " + listName);
        };

        // Submit tasks to the executor service
        executor.submit(task);
        executor.submit(task);

        // Shut down the executor and wait for tasks to complete
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}
