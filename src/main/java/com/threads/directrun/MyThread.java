package com.threads.directrun;

public class MyThread extends Thread{
	public static void main(String[] args) {
		
	Thread t =new MyThread();
	//t.start();
	t.run();
	}

	@Override
	public void run() {
		System.out.println("run method");
		
	}
}
