package com.Interview.Programs;

import java.util.Arrays;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 18, 24, 30, 36 };
		int num = 5;
		System.out.println(generalizedGCD(num, arr));

	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
//	public static int generalizedGCD(int num, int[] arr) {
//		// WRITE YOUR CODE HERE
//		int gcd = 0;
//		if (num == 0)
//			return gcd;
//		else if (num == 1)
//			return arr[0];
//		else if (num > 1) {
//			Arrays.sort(arr);
//			int count = 1;
//			int temp = 0;
//			for (int i = 0; i <= arr.length - 1; i++) {
//				if (arr[i] == 0)
//					return 0;
//				if (arr[i] % arr[0] == 0 || arr[0] % arr[i] == 0) {
//					if (arr[i] > arr[0])
//						gcd = arr[0];
//					else
//						gcd = arr[i];
//				} else if (arr[i] % arr[0] != 0 || arr[0] % arr[i] != 0) {
//					if (count == 1) {
//						temp = arr[i] % arr[0];
//					}
//
//					else if (arr[i] % arr[0] == temp) {
//
//						gcd = temp;
//						count++;
//
//					} else
//						return 1;
//
//				}
//			}
//			if (gcd > 0)
//				return gcd;
//			else
//				return -gcd;
//		} else
//			return gcd;
//	}
	public static int generalizedGCD(int num, int[] arr) {
		int res = 0;
		int result = 0;
		if (arr[0] > arr[1]) {
			result = arr[0] % arr[1];
		}

		else if (arr[1] > arr[0]) {
			result = arr[1] % arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			while (arr[i] > 0) {
				int temp = arr[i];
				arr[i] = result % arr[i];
				result = temp;
				
			}
			res = result;

		}

		return res;

	}

}
