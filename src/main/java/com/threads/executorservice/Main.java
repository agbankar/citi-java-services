package com.threads.executorservice;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NTHREDS = 3;

    public static void main(String[] args) throws InterruptedException {
    	int totalTasks=10;
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		CountDownLatch latch = new CountDownLatch(totalTasks);
        for (int i = 0; i < totalTasks; i++) {
            Runnable worker = new MyRunnable( i,latch);
            executor.submit(worker);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        latch.await();
        // Wait until all threads are finish
        System.out.println("Finished all threads");
    }
}
