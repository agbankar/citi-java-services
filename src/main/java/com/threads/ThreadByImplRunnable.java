package com.threads;

public class ThreadByImplRunnable implements Runnable {

	private String name;

	@Override
	public void run() {

		try {
			ThreadByImplRunnable r = (ThreadByImplRunnable) this;
			System.out.println(r.name);
			synchronized (r) {
				
			
			for (int i = 0; i < 5; i++) {
				System.out.print(i + " ");

			}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadByImplRunnable("ashish"));
		t1.start();
		//t1.join();

		Thread t2 = new Thread(new ThreadByImplRunnable("manish"));
		t2.start();
	}

	public ThreadByImplRunnable(String name) {
		super();
		this.name = name;
	}

}
