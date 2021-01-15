package com.threads;

public class ThreadByExtendingThreadClass extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args) {
		ThreadByExtendingThreadClass r = new ThreadByExtendingThreadClass();
		r.start();
	}

}
