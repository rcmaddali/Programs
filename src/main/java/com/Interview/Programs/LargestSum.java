package com.Interview.Programs;

public class LargestSum {

	public static void main(String[] args) {
		
		int a[] = {2,5,25,-52,77,-63,73,25,56,30};
		System.out.println(sum(a));
		
	}
	
	public static int sum(int []a) {
		
		int sum=0;
		
		for(int i=0; i<a.length-1; i++) {
			
			int total =  a[i]+ a[i+1];
			if(total>sum)
				sum = total;
		}
		
		return sum;
		
	}

}
