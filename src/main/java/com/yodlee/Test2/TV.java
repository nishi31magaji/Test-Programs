package com.yodlee.Test2;

public class TV {
	public int screenSize;
	public String brandName;

	public TV(int screenSize, String brandName) {
		this.screenSize = screenSize;
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "TV [screenSize=" + screenSize + ", brandName=" + brandName + "]";
	}

}
