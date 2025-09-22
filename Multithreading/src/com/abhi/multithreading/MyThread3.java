package com.abhi.multithreading;

class MyThread3 extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        
        // This creates a new thread and calls run() on it.
        // Output will show 'Thread-0' or similar name.
        t.start(); 
        
        // This executes the run() method on the main thread.
        // Output will show 'main' thread name.
        t.run();
    }
}