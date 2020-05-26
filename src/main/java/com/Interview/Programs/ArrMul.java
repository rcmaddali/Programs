package com.Interview.Programs;

import java.util.Arrays;

public class ArrMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,9 };  //{120,60,40,30,24}
		int n = 3;
		System.out.println(mul(a, n));

	}

	public static String mul(int a[], int n) {
		int num = 1;
		for (int i = 0; i <= a.length - 1; i++) {
			num = num * a[i];
			
		}
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==0)
				return String.valueOf(0);
			else {
				int temp = num/a[i];
				a[i]= temp;
			}
			
		}
		
		return Arrays.toString(a);
		
		
	}
}
