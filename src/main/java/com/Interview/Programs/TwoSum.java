// Given an array of integers, find the integers and their indices that add up to a certain sum.
package com.Interview.Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 12, 5, 35, 31, 43, 56, 5, 3, 7, 10, 23 };
		int sum = 66;
		System.out.println(sum(a, sum));
	}

	public static String sum(int[] a, int sum) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			hm.put(a[i], i);
			int value = sum - a[i];
			if (hm.containsKey(value)) {
				al.add(value);
				al.add(hm.get(value));
				al.add(a[i]);
				al.add(i);
			}
		}

		return al.toString();
	}
}
