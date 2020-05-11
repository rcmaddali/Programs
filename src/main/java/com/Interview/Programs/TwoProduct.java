//Find a pair such that the product is maximum.
package com.Interview.Programs;

import java.util.ArrayList;
import java.util.List;

public class TwoProduct {

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 34, 67, 15, 45 };
		System.out.println(product(a));

	}

	public static String product(int[] a) {

		int max =0; 
		int smax=0;
		List<Integer> pair = new ArrayList<Integer>();
		
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]> max) {
				smax = max;
				max = a[i];
			}
			else if(a[i]>smax && a[i] != max) {
				smax = a[i];
			}	
		}
		pair.add(max);
		pair.add(smax);
		return pair.toString();
		
	}

}
