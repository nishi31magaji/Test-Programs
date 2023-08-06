package com.yodlee.Test2;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Message> queue;

	public Producer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Message msg = new Message("" + i);

			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Producer added msg" + msg.getMsg());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
