package com.yodlee.Test2;

public class SingletonDesignPattern {
	private static SingletonDesignPattern instance;
	
	private SingletonDesignPattern() {
		
	}
	
	public static SingletonDesignPattern getInstance() {
		if(instance==null) {
			synchronized (SingletonDesignPattern.class) {
				if(instance==null) {
					instance = new SingletonDesignPattern();
					System.out.println("new instance created");
				}
			}
		}
		return instance;
	}
public static void main(String[] args) {
	System.out.println(getInstance());
	System.out.println(getInstance());


}
}
