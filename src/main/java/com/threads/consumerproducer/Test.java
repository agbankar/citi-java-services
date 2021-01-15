package com.threads.consumerproducer;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		Resources rs = new Resources();
		ResourceThread m1 = new ResourceThread(rs, "Producer");
		ResourceThread m2 = new ResourceThread(rs, "Consumer");
		m1.start();
		m2.start();

		
	}
}
