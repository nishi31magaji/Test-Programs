package com.yodlee.Test2;

public class SingleTonEnum {
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.INSTANCE;
		SingleTon s2 = SingleTon.INSTANCE;
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

	
}

enum SingleTon{
	INSTANCE;
	int i;
	void display() {
		System.out.println("value of i:"+i);
	}
}