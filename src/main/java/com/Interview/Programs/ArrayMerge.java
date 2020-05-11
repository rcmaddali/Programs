package com.Interview.Programs;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs

		int a[] = { 1, 3, 5, 7, 9 };
		int b[] = { 2, 4, 6, 8, 10 };

		System.out.println(sum(a, b));

	}

	public static String sum(int a[], int b[]) {

		int m = a.length;
		int n = b.length;
		int p = 0;
		int[] c = new int[m + n];
		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (a[i] < b[j]) 
				c[p++] = a[i++];

			 else 
				c[p++] = b[j++];
			
		}
		while (i < m) {
			c[p++] = a[i++];
		}
		while (j < n) {
			c[p++] = b[j++];
		}

		return Arrays.toString(c);

	}

}
