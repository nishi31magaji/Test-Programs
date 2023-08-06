package com.yodlee.Test2;

public class TVBuilder {
	public int screenSize;
	public String brandName;

	public TVBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public TVBuilder setBrandName(String brandName) {
		this.brandName = brandName;
		return this;
	}
	
	public TV getTV() {
		TV tv = new TV(screenSize,brandName);
		return tv;
	}

}
