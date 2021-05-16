package com.threads.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ProducerConsumer {
    public static void main(String[] args) throws Exception {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(2);
        Runnable producer = () -> {
           while (true){
                int random = new Random().nextInt(10);
                System.out.println("generated" + random);
               try {
                   Thread.sleep(2*1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
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
