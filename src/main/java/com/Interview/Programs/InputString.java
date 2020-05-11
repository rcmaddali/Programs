package com.Interview.Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InputString {

	public static void main(String[] args) {

		System.out.println(process("abbbccccaaa"));
	}

	public static String process(String mystring) {

		int count = 0;
		List<HashMap<Character, Integer>> map = new ArrayList<HashMap<Character, Integer>>();
		
		for (int i = 0; i <= mystring.length() - 1; i++) {
			if ((i + 1) != mystring.length()) {
				if (mystring.charAt(i) == mystring.charAt(i + 1))

				{
					count = count + 1;

				}

				else {
					count = count + 1;
					HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
					hm.put(mystring.charAt(i), count);
					map.add(hm);
					count = 0;
				}

			} else {
				count = count + 1;
				HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
				hm.put(mystring.charAt(i), count);
				map.add(hm);
			}

		}
		return map.toString();

	}
}
