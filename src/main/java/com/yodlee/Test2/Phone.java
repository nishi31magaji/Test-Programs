package com.yodlee.Test2;

public class Phone {
private String os;
private int screenSize;
private int memory;
private String processorName;

public Phone(String os,int screenSize,int memory,String processorName) {
	this.os=os;
	this.screenSize=screenSize;
	this.memory=memory;
	this.processorName=processorName;
}

public String toString() {
	return "phone is created os is: "+os +"ScreenSize: "+screenSize+"memory: "+memory+"processorName: "+processorName;
}
}
