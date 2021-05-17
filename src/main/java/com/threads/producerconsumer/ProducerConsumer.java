package com.threads.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) throws Exception {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(100);
        for (int i = 0; i < 100; i++) {
            blockingQueue.put(i);
        }
        Runnable producer = () -> {
            while (true) {
                int random = new Random().nextInt(10);
                System.out.println("generated " + random);
                try {
                    blockingQueue.put(random);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Runnable consumer = () -> {
            while (true) {
                try {
                    System.out.println("consuming " + blockingQueue.take());
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread pThread = new Thread(producer);
        Thread cThread = new Thread(consumer);
        pThread.start();
        cThread.start();
    }
}
