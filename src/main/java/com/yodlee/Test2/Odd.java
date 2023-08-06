package com.yodlee.Test2;

import java.util.Arrays;
import java.util.List;

public class Odd {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	for(int i : list) {
		if(i%2==0) {
			System.out.println("does not contain only odd numbers");
			break;
		}
		
	}
	System.out.println(list.parallelStream().anyMatch(n -> n%2==0));
}
}
