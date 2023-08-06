package com.yodlee.test;

import java.util.ArrayList;

public class TestArray {
	static int arr[] = { 7, 6, 2, 4, 5, 8, 1 };
	//static int arr[] = {7,6,4,3,1};
	//static int arr[] = {50,90,130,155,20,267,347};
	
	// this logic works when numbers are in order. but dint work either {50,90,130,155,20,267,347};
	public static void main(String args[]) {
		System.out.println(maxProfit(arr));
	}

	static int maxProfit(int[] arr) {
		/*
		 * int buy = arr[0]; int profit = 0; int maxVal = 0; int maxProfit = 0;
		 * 
		 * for (int val : arr) { int z = val - buy; System.out.println("z:"+z); profit =
		 * Math.max(profit, z); System.out.println("profit:"+profit); buy =
		 * Math.min(buy, val); System.out.println("buy:"+buy);
		 * System.out.println("-------------");
		 * 
		 * if (max_val>profit) profit = maxVal; } //System.out.println("buy:"+buy);
		 * return profit;
		 */
		int sum =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]>0)
				sum = sum + (arr[i+1]-arr[i]);
		}
		return sum;
	}
}
