package com.threads.java8;

public class LambdatThreads {
	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("inside runnable");
		
	};
	Thread t= new Thread(r);
	t.start();
	}

}
