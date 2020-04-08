package com.Interview.Programs;

public class NumberofEvenAndOddDigits {

	public static void main(String[] args) {

		int a = 11199991;

		System.out.println("Number of even digits are: " + evenDigits(a));
		System.out.println("Number of odd digits are: " + oddDigits(a));

	}

	public static int evenDigits(int num) {

		int even = 0;
		int rem = 0;
		while (num != 0) {

			rem = num % 10;
			if (rem % 2 == 0)
				even = even + 1;
			num = num / 10;
		}
		return even;
	}

	public static int oddDigits(int num) {

		int odd = 0;
		int rem = 0;
		while (num != 0) {

			rem = num % 10;
			if (rem % 2 == 1)
				odd = odd + 1;
			num = num / 10;
		}
		return odd;
	}

}
