package com.Interview.Programs;

public class IntPalin {

	public static void main(String[] args) {
		
		int a = 121;
		int b = 234;
		System.out.println(isPalin(a));
		System.out.println(isPalin(b));
	}
	
	public static boolean isPalin(int a) {
		
		int palin = a;
		int rev =0;
		
		
		while(palin!=0) {
		
			int rem = palin%10;
			rev = rev*10+rem;
			palin = palin/10;
		}
		if(rev == a)
			return true;
		else 
			return false;
		
	}

}
