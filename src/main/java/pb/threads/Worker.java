package pb.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

public class Worker {
    private static Object lock = new Object();
    static CountDownLatch latch = new CountDownLatch(2);
    public static void main(String[] args) throws Exception {
        Runnable printOdd = () -> {
            for (int i = 1; i <= 10; i += 2) {
                synchronized (lock) {
                    System.out.println("ODD:=" + i);
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            latch.countDown();
        };

        Runnable printEven = () -> {
            for (int i = 2; i <= 10; i += 2) {
                synchronized (lock) {
                    System.out.println("EVEN:=" + i);
                    lock.notifyAll();
                    try {
                        if (i != 10)
                            lock.wait(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            latch.countDown();

        };
        System.out.println("Executing Runnable threads---------------");

        Thread odd = new Thread(printOdd);
        Thread even = new Thread(printEven);
        odd.start();
        even.start();
        latch.await();
        latch= new CountDownLatch(2);

        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
        System.out.println("Executing callable threads---------------");

        Callable<Boolean> oddCallable = () -> {
            synchronized (lock) {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("Callable ODD:=" + i);
                    lock.notifyAll();
                    try {
                        if (i!=9)
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                latch.countDown();
                return true;
            }
        };

        Callable<Boolean> evenCallable = () -> {
            synchronized (lock) {
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("Callable EVEN:=" + i);
                    lock.notifyAll();
                    try {
                        if (i != 10)
                            lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                latch.countDown();
                return true;

            }


        };
        Thread oddCallableThread = new Thread(new FutureTask<Boolean>(oddCallable));
        Thread evenCallableThread = new Thread(new FutureTask<Boolean>(evenCallable));


        oddCallableThread.start();
        evenCallableThread.start();


    }
}



