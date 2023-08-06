package com.yodlee.Test2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {
 public static void main(String[] args) {
	BlockingQueue<Message> queue = new ArrayBlockingQueue(10);
	Producer producer = new Producer(queue);
	Consumer consumer = new Consumer(queue);
	Thread t1 = new Thread(producer);
	Thread t2 = new Thread(consumer);
	t1.start();
	t2.start();
	System.out.println("Producer and Conumers are started");
}
}
