package com.yodlee.Test2;

public class Fibo {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int c = 1;
	for(int i=0;i<5;i++) {
		System.out.println(a +" ");
		a = b;
		b = c;
		c = a+b;
	}
	
	int n = 5;
	for(int i=0;i<n ;i++) {
		System.out.println(fibo(i));
	}
}

public static int fibo(int n) {
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	else
		return fibo(n-1)+fibo(n-2);
}
}
