package com.yodlee.Test2;

public class PhoneBuilder {
	private String os;
	private int screenSize;
	private int memory;
	private String processorName;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setMemory(int memory) {
		this.memory = memory;
		return this;
	}
	public PhoneBuilder setProcessorName(String processorName) {
		this.processorName = processorName;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, screenSize, memory, processorName);
	}
	
	
}
