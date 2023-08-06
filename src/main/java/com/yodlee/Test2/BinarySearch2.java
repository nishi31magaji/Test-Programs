package com.yodlee.Test2;

import java.util.Arrays;

public class BinarySearch2 {
public static void main(String[] args) {
	int[] intArray = {32,1,2,5,46,78,90};
	int key = 99;
	//1,2,5,32,46,78,90
	Arrays.sort(intArray);
	int index = binarySerach(intArray,key);
	System.out.println("Element found @ index:"+index);
}
public static int binarySerach(int[]intArray,int key) {
	int low =0;
	int high = intArray.length-1;
	int mid = (low+high)/2;
	while(low<=high) {
		if(intArray[mid]<key)
			low = mid + 1;
		else if(intArray[mid]==key)
			return mid;
		else
			high = mid - 1;
		
		mid = (low + high)/2;
	}
	if(low>high) {
		return -1;
	}
	return -1;
}
}
