package com.yodlee.Test2;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
	public static void main(String[] args) {
		Integer[] intArray = { 12, 31, 14, 56, 89, 30 };
		Arrays.sort(intArray);
		System.out.println("ascending");
		for (int a : intArray) {
			System.out.println(a);
		}

		System.out.println("descending");
		Arrays.sort(intArray, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		for (int a : intArray) {
			System.out.println(a);
		}
	}
}
