package com.yodlee.Test2;

public class OSFactory {
	public OS getOS(String type) {
		if(type.equals("closed")) {
			return new Windows();
		}
		else if(type.equals("open")) {
			return new IOS();
		}
		else {
			return new Android();
		}
	}
}
