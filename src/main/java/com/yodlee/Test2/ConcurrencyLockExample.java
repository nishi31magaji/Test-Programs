package com.yodlee.Test2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
	public void doSomething() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public void doLogging() {

	}
}

public class ConcurrencyLockExample implements Runnable {

	private Resource resource;
	private Lock lock;

	public ConcurrencyLockExample(Resource r) {
		this.resource = r;
		lock = new ReentrantLock();
	}

	@Override
	public void run() {
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				System.out.println(Thread.currentThread().getName());
				resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		resource.doLogging();
	}

	public static void main(String[] args) {
		Resource r = new Resource();
		ConcurrencyLockExample c = new ConcurrencyLockExample(r);
		Thread t1 = new Thread(c);
		t1.start();
		Thread t2 = new Thread(c);
		t2.start();

	}
}
