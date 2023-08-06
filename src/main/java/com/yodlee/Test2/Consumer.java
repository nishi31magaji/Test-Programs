package com.yodlee.Test2;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	private BlockingQueue<Message> blockingQueue;
	Message msg;
	public Consumer(BlockingQueue q) {
		blockingQueue = q;
	}
	@Override
	public void run() {
			try {
				while((msg=(Message)blockingQueue.take()).getMsg()!="exit") {
				System.out.println("Consumer consumed message:"+msg.getMsg());
			} 
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

