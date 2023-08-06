package com.yodlee.Test2;

public class CheckPrime {
public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPrime(2));
		System.out.println(isPrime(4));

}

public static boolean isPrime(int num) {
	if(num==0 || num==1)
		return false;
	if(num==2)
		return true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0)
			return false;
		}
	return true;
	}
}