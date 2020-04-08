package com.Interview.Programs;

import java.util.HashMap;
import java.util.Map;


public class FirstOccurenceinArray {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 3, 5 };

		System.out.println(firstArrayOccurence(n));
	}

	public static String firstArrayOccurence(int[] a) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 1;

		for (int i = 0; i <= a.length - 1; i++) {

			
			if (hm.get(a[i]) == null)
				hm.put(a[i], 1);

			else
				hm.put(a[i], ++count);
		}

		return hm.toString();

}

}