package com.threads.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Integer> task = () -> {
			return 15;

		};
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> f = service.submit(task);
		System.out.println(f.get());
		}
	
	}
