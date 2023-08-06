package com.yodlee.Test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find2ndHighestNum {
	public static void main(String[] args) {
		// consider both positive and negative integers
		List<Integer> list = Arrays.asList(2, 3, 4, 56, 7, 37, 7, -1,-2,56,37);
	//	int a = list.stream().map(m -> m.byteValue()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	//	System.out.println(a);
		
		System.out.println(list);
		
		int highest = list.get(0);
		int secondHighest = highest;

		if (list.size() == 2 && list.get(0) < list.get(1)) {
			//secondHighest = list.get(1);
		}
		for (int i = 1; i <= list.size()-1; i++) {
			if (highest<list.get(i)) {
				highest = list.get(i);				
			}
			else if(highest>list.get(i) && secondHighest<list.get(i)){
				secondHighest = list.get(i);
			}
		}
		System.out.println("highest:"+highest);
		System.out.println("secondHighest:"+secondHighest);

	}
}
