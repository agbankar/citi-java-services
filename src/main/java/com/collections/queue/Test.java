package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		Queue queue= new PriorityQueue<>();
		queue.add("1");
		queue.add("2");
		queue.add("3");
		System.out.println("before:  ");
		while (!queue.isEmpty()) {

			System.out.println(queue.remove());
		}
	}

}
