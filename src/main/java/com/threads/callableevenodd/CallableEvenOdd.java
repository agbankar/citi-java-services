package com.threads.callableevenodd;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableEvenOdd {
    private static Object monitor = new Object();

    public static void main(String[] args) {
        int counter = 10;

        Callable<Boolean> odd = () -> {
            for (int i = 1; i < 10; i++) {
                synchronized (monitor) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                    monitor.notifyAll();
                    monitor.wait();
                }

            }
            return true;
        };
        Callable<Boolean> even = () -> {
            for (int i = 2; i < 10; i++) {
                synchronized (monitor) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }

                    monitor.notifyAll();
                    monitor.wait();
                }

            }
            return true;
        };


        Thread oddThread = new Thread(new FutureTask<>(odd));
        Thread evenThread = new Thread(new FutureTask<>(even));
        oddThread.start();
        evenThread.start();
    }
}
