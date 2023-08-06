package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AlternateElementList {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//for (int i = 1; i < list.size(); i++) {
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);

	}
}