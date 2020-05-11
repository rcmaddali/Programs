//WAP to find if a given number is a perfect square of which number

package com.Interview.Programs;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int num = 144;
		System.out.println(squareRoot(num));

	}

	public static int squareRoot(int n) {

		int a = 0;

		for (int i = 2; i <= n; i++) {

			if (n == i * i) {

				a = i;
			}

			else if (a == i)
				return n;
		}
		return a;

	}
}
