package com.threads.evenoddprint;

public class PrintEven implements Runnable{
private Object lock;
public PrintEven(Object lock) {
    this.lock =  lock;
}
@Override
public void run() {
    synchronized (lock) {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("EVEN:="+i);
            lock.notify();
            try {
                //if(i!=10) lock.wait();
                lock.wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

  }
}
