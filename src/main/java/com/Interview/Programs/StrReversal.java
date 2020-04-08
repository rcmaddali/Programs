package com.Interview.Programs;

import java.util.Arrays;

public class StrReversal {

	public static void main(String[] args) {

		String a = "Ravi";
		System.out.println(rev(a));

	}

	public static String rev(String s) {

		System.out.println(s);
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length() / 2; i++) {

			char temp = ch[i];
			ch[i] = ch[(s.length() - 1) - i];
			ch[(s.length() - 1) - i] = temp;

		}

		s = Arrays.toString(ch);
		return s;

	}

}
