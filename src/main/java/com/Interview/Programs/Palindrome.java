package com.Interview.Programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "noon";
		String b = "lappy";
		System.out.println(isPalin(a));
		System.out.println(isPalin(b));

	}
	
	public static boolean isPalin(String a) {
		
		for (int i =0; i<a.length()/2-1; i++) {
			
			if(a.charAt(i) != a.charAt(a.length()-1)-i)
				return false;
		}
		return true;
		
	}

}
