package com.threads.evenoddprint;

public class PrintEvenOdd {
	public static void main(String[] args) throws InterruptedException{
	    Object lock = new Object(); 
	    Thread thread1 =  new Thread(new PrintOdd(lock));
	    Thread thread2 =  new Thread(new PrintEven(lock));
	    thread2.start();


	    thread1.start();
	    
	}

}
