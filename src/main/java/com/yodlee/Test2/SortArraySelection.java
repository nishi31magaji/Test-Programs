package com.yodlee.Test2;

public class SortArraySelection {
public static void main(String[] args) {
	int[] intArray = {21,35,62,12,45,75,34};
	for(int i=0;i<intArray.length;i++) {
		for(int j=i;j<intArray.length;j++) {
			if(intArray[j]>intArray[i]) {
				int temp = intArray[i];
				intArray[i]=intArray[j];
				intArray[j]=temp;
			}
		}
	}
	
	for(int i=0;i<intArray.length;i++) {
		System.out.println(intArray[i]);
	}
}
}
