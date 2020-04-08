//WAP to find the sum of digits of a number

package com.Interview.Programs;

public class SumofDigitsofaNumber {

	public static void main(String[] args) {

		int a = 12345;
		System.out.println(sum(a));

	}

	public static int sum(int n) {

		int sum = 0;
		while (n > 0) {

			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;

	}

}
