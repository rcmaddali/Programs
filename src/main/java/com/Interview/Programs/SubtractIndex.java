//Given an array with numbers 1-5,subtract one number from every EVEN number in each index
package com.Interview.Programs;

import java.util.Arrays;

public class SubtractIndex {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(subInd(a));

	}

	public static String subInd(int a[]) {
		int a1[] = new int[a.length];

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 2 == 0) {
				a1[i] = a[i] - 1;
			} else {
				a1[i] = a[i];
			}

		}
		return Arrays.toString(a1);
	}

}
