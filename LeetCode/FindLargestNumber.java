package LeetCode;

import java.util.Arrays;

public class FindLargestNumber {
	int val=10;
public static void main(String[] args) {
	int result=0;
	int[] arr = {43,123,656,788,1,23};
	Arrays.sort(arr);
	result=arr[arr.length-1];
	System.out.println("largest number is:"+result);
	FindLargestNumber fl = new FindLargestNumber();
	System.out.println("val:"+fl.val);
	
}
}
