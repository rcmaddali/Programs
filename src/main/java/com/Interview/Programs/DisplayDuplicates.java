//write a program to remove duplicates numbers from the list and display the duplicates
package com.Interview.Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisplayDuplicates {

	public static void main(String[] args) {

		int []a = {1,2,1,3,67,93,23,45,3,23,32, 45,10,18, 12,10};
		System.out.println(remDup(a));

	}
	
	public static String remDup(int []a ) {
		
		List<Integer> al = new ArrayList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<=a.length-1; i++) {
			
			if(hs.contains(a[i])) {
				
				al.add(a[i]);
			}
			else {
				hs.add(a[i]);
			}
		}
		System.out.println(hs.toString());
		return al.toString();
		
	}

}
