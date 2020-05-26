package com.Interview.Programs;

public class AlternateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ravi"; // RaAbVcIdNeH -- rAaBvCiDnEh
		alternates(a);

	}

	public static void alternates(String a) {

		for (int i = 0; i <= a.length() - 1; i++) {
			if (Character.isUpperCase(a.charAt(i))) {
				for (char j = 'a'; j <= 'z' && i <= a.length() - 1; j++) {
					System.out.print(Character.toString(a.charAt(i)) + Character.toString(j));
						i = i + 1;
	

				}
			} else if (Character.isLowerCase(a.charAt(i))) {
				for (char j = 'A'; j <= 'Z' && i <=a.length() - 1; j++) {
					System.out.print(Character.toString(a.charAt(i)) + Character.toString(j));
						i = i + 1;

				}
			}

		}
	}

}
