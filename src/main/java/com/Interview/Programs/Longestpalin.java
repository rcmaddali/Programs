package com.Interview.Programs;

public class Longestpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "pavanaja";
		System.out.println(checkLongestPalin(s));

	}

	public static int checkLongestPalin(String a) {
		int count = 0;
		int length = a.length();
		//System.out.println(length);

		for (int i = 0; i <= a.length() - 1; i++) {
			if (i < length-2) {
				String subStr = a.substring(i, i + 3);
				System.out.println("Before j loop: "+subStr);
				for (int j = 0; j <= subStr.length() - 1; j++) {
					System.out.println(subStr);
					if (subStr.charAt(j) != subStr.charAt(subStr.length() - 1) - j);
					i = i + 1;
				}
				
				count = count + 1;
				

			}
		}
		return count;
	}

}
