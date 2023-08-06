package com.yodlee.Test2;

public class Fibonacci {
public static void main(String[] args) {
	int n = 5;
	
	fibonacci(n);
	System.out.println("--------------------------------");
	for(int i = 0;i<n;i++) {
		System.out.println(fibonacciRecursion(i)+ " ");
	}
	
}


public static int fibonacciRecursion(int n) {
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	else
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n-2);
}


public static void fibonacci(int n) {
	int a = 0;
	int b = 1;
	int c = 1;

	for (int i = 1; i <= n; i++) {
		System.out.println(a + " ");
		a = b;
		b = c;
		c = a + b;
		}
	}
}
