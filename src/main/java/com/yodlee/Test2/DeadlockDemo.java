package com.yodlee.Test2;

public class DeadlockDemo {
	

public static void main(String[] args) {
		final String resource1 = "string1";
		 final String resource2 = "string2";
	Thread t1=new Thread(new Runnable(){

	@Override
	public void run(){
		synchronized(resource1){
			System.out.println("Resource1 thread1");
			synchronized(resource2){
				System.out.println("Resource2 thread1");
				}
			}
	}});

	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			synchronized(resource2) {
				System.out.println("Resource2 Thread2");
				synchronized(resource1) {
					System.out.println("Resource1 Thread2");
				}
			
		}
	
		}});
	t1.start();
	t2.start();	
	}
	
}
