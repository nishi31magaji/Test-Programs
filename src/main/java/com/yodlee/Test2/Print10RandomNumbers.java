package com.yodlee.Test2;

import java.util.Random;

public class Print10RandomNumbers {
	public static void main(String[] args) {
		 Random random = new Random();
		    random.ints().limit(10).forEachOrdered(System.out::println);
	}
}
