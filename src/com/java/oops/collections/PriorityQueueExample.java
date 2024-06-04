package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

//		PriorityQueue<Integer> queue = new PriorityQueue();//MinHeap
		PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());//MaxHeap


		queue.add(23);
		queue.add(-7);
		queue.add(-3);

		queue.add(123);
		queue.add(2323);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);

		System.out.println(queue.poll());
		System.out.println(queue);

		System.out.println(queue.poll());
		System.out.println(queue);

		
		System.out.println(queue.peek());
		System.out.println(queue);


	}

}
