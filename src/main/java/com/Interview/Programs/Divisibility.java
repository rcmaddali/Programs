package com.Interview.Programs;

public class Divisibility {

	public static void main(String[] args) {
		
		System.out.println(checkDiv(-32));
		System.out.println(checkDiv(8));
		System.out.println(checkDiv(16));
		System.out.println(checkDiv(32));
		System.out.println(checkDiv(0));
		System.out.println(checkDiv(2));

	}
	public static String checkDiv(int a) {
		
		if(a!=0) {
			if(a % 32 == 0)
				return "ANIMAL";
			else if (a % 16 == 0)
				return "ANIM";
			else if (a % 8 ==0)
				return "AN";
			else return "Not a divisible number";
		}
		if (a == 0)
			return "Entered Integer is 0";
		return null;
	}
}
