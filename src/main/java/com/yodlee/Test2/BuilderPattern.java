package com.yodlee.Test2;

public class BuilderPattern {
	public static void main(String[] args) {
		System.out.println("Construct a phone");
		Phone phone = new Phone("Android", 16, 32, "i7");
		System.out.println(phone);
		System.out.println("Construct a phone");
		Phone phone2 = new PhoneBuilder().setMemory(32).setOs("iOS").getPhone();
		System.out.println(phone2);

	}

}
