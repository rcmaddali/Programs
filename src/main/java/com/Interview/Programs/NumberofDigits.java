package com.Interview.Programs;

public class NumberofDigits {

	public static void main(String[] args) {
		
		int a = 153682;
		
		System.out.println(noOfDigits(a));

	}
	
	public static int noOfDigits(int n) {
		
		int count = 0;
		
		while(n!=0) {
			
			n = n/10;
			count++;
		}
		
		return count;
	}

}
