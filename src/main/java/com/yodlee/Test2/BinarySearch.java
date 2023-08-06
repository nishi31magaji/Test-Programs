package com.yodlee.Test2;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] intArray = { 43, 12, 56, 21, 29, 9 };
		Arrays.sort(intArray);
		for(int i:intArray) {
			System.out.println(i);
		}
		int key = 99;
		int index = binarySearch(intArray, key);
		System.out.println("element found at index:" + index);

	}

	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length-1;
		int mid = (low + high) / 2;
		while (low <= high) {
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}

		if (low > high) {
			return -1;
		}

		return -1;
	}
}
