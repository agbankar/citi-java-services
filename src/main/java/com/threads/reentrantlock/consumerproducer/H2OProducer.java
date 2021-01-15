package com.threads.reentrantlock.consumerproducer;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class H2OProducer {
	static Lock lock = new ReentrantLock(true);
	static Condition condition = lock.newCondition();
static AtomicBoolean flag= new AtomicBoolean();
	public static void main(String[] args) {
		try {
			Thread h1 = new Thread(() -> {
				try {
					hydrogenProducer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			h1.setName("h1 thread");
			Thread h2 = new Thread(() -> {
				try {
					hydrogenProducer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			h2.setName("h2 thread");

			Thread o = new Thread(() -> {
				try {
					oxygenProducer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			o.setName("o thread");

			h1.start();
			h2.start();
			o.start();

			try {
				h1.join();
				h2.join();
				o.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
		}

	}

	public static void hydrogenProducer() throws InterruptedException {
		try {
			lock.lock();

			while(true) {
				
			System.out.println(Thread.currentThread().getName());
			System.out.println("h");
			condition.signal();
			}
		} finally {
			lock.unlock();
		}

	}

	public static void oxygenProducer() throws InterruptedException {
		try {
			while(true) {
			lock.lock();
			System.out.println("o");
			condition.signalAll();
			}
		} finally {
			lock.unlock();
		}
	}
}
