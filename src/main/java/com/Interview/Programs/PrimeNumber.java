package com.Interview.Programs;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 10;
		int n1 = 13;

		System.out.println(isPrime(n));
		System.out.println(isPrime(n1));
	}

	@SuppressWarnings("unused")
	public static boolean isPrime(int a) {

		if (a <0 || a == 0 || a == 1)
			return false;
		else {
			for (int i = 2; i <= a; i++) {

				if (a % i == 0)
					return false;
				else
					return true;
			}
		}
		return true;
	}

}
