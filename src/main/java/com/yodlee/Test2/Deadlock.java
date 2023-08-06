package com.yodlee.Test2;

public class Deadlock {

	public static void main(String[] args) {
		String resource1 = "nishi";
		String resource2 = "mani";
		
		Thread thread1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println(resource1);
					synchronized(resource2) {
						System.out.println(resource2);
					}
				}
			}
		};
		thread1.start();
		Thread thread2 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println(resource2);
					synchronized(resource2) {
						System.out.println(resource1);
					}
				}
			}
		};
		thread2.start();
	}
}
