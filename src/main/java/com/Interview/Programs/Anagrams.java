package com.Interview.Programs;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Amazon";
		String b = "Zonama";
		System.out.println(isAnagram(a, b));

	}

	public static boolean isAnagram(String a, String b) {

		int count = 1;
		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character, Integer> a_counts = new HashMap<Character, Integer>();
		Map<Character, Integer> b_counts = new HashMap<Character, Integer>();

		for (int i = 0; i <= a.length() - 1; i++) {
			if (a_counts.containsKey(a.charAt(i))) {
				a_counts.put(a.charAt(i), count + 1);
			} else {
				a_counts.put(a.charAt(i), count);
			}

		}
		System.out.println(a_counts.toString());
		for (int i = 0; i <= b.length() - 1; i++) {
			if (b_counts.containsKey(b.charAt(i))) {
				b_counts.put(b.charAt(i), count + 1);
			} else {
				b_counts.put(b.charAt(i), count);
			}

		}
		System.out.println(b_counts.toString());
		if (a_counts.toString().equals(b_counts.toString()))
			return true;
		else
			return false;
	}

}
