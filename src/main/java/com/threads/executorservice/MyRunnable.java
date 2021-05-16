package com.threads.executorservice;

import java.util.concurrent.CountDownLatch;

/**
 * MyRunnable will count the sum of the number from 1 to the parameter
 * countUntil and then write the result to the console.
 * <p>
 * MyRunnable is the task which will be performed
 *
 * @author Lars Vogel
 */
public class MyRunnable implements Runnable {
    private int value;
    CountDownLatch latch;

    MyRunnable(int countUntil, CountDownLatch latch) {
        this.value = countUntil;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(value);

            Thread.sleep(10 * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();

        }

    }

}