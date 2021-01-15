package com.threads.evenoddprint;

public class PrintOdd implements Runnable {
private Object lock;
public PrintOdd(Object lock) {
    this.lock =  lock;
}
@Override
public void run() {
    synchronized (lock) {
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("ODD:="+i);
            lock.notify();
            try {
                //if(i!=9) lock.wait();
                lock.wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}
