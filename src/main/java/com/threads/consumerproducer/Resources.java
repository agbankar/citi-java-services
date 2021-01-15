package com.threads.consumerproducer;

import java.util.LinkedList;

public class Resources {
	private final int capacity = 2;
	public static int value = 0;

	LinkedList < Integer > list;

	Resources() {
	    list = new LinkedList < > ();
	}

	void consume() throws InterruptedException {
	    while (true) {
	        synchronized(this) {
	            while (list.size() == 0) {
	                wait();
	            }
	            int val = list.removeFirst();
	            System.out.println("Value consumed:" + val);
	            notify();
	            //Thread.sleep(1000);
	        }
	    }
	}

	void produce() throws InterruptedException {
	    while (true) {
	        synchronized(this) {
	            while (list.size() == capacity) {
	                wait();
	            }
	            System.out.println("Value produced:" + value);
	            list.add(value++);
	            notify();
	            Thread.sleep(1000);

	        }
	    }
	}
	}

