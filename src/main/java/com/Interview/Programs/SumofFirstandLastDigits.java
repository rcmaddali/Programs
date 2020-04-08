//WAP to find the sum of first and last digits of a given integer

package com.Interview.Programs;

public class SumofFirstandLastDigits {

	public static void main(String[] args) {

		int a = 125;
		int fN = firstNum(a);
		int lN = lastnum(a);
		int Sum = fN + lN;
		if (Sum == 0)
			System.out.println("Number is not positive");
		else
			System.out.println(Sum);

	}

	public static int firstNum(int n) {

		//int firstNum = n;
	      int fn =0;
		while (n >= 10) { 
		fn = n / 10;
		 n = n/10;
		}
		return fn;
		
	}

	public static int lastnum(int n) {

		while (n > 0) {

			int lastnum = n % 10;
			return lastnum;

		}
		return 0;
	}

}
