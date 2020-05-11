//Given an array of integers, move the duplicate integers into a different array

package com.Interview.Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 2, 5, 5, 16, 18, 23, 26, 32, 23, 8, 16 };
		System.out.println(move(a));
	}

	public static String move(int[] a) {
		List<Integer> al = new ArrayList<Integer>();
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			if (hm.containsKey(a[i])) {
				al.add(a[i]);
			} else {
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm.toString());
		return al.toString();
	}
}
