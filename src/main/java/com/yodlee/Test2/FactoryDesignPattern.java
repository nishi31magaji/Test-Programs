package com.yodlee.Test2;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		OSFactory factory = new OSFactory();
		OS os = factory.getOS("closed");
		os.createOS();
	}
	
}
