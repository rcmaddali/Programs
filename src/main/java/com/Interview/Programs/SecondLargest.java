package com.Interview.Programs;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] a = {1,4,2,25,36,-25,-36,75,96,99,98};
		System.out.println(secondBiggest(a));
	}
	
	public static int secondBiggest(int [] a) {
		
		int max =0;
		int smax =0;
		
		for(int i =0 ; i<=a.length-1; i++) {
			
			if(a[i]>max) {
				smax = max;
				max = a[i];
			}
		else if(a[i]> smax && a[i]!= max) {
				smax = a[i];
			}
			
		}
		return smax;
		
	}

}
