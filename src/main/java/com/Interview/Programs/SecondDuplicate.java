package com.Interview.Programs;


import java.util.Scanner;

public class SecondDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Ravi";
		String b = "Naveen";
		@SuppressWarnings("resource")
		Scanner myinp = new Scanner(System.in);
		System.out.println("Enter the nth duplicate needed:");
		String inp = myinp.nextLine();
		int n = Integer.parseInt(inp);
		if (n > 0) {
			secDup(a, b, n);
		} else
			System.out.println("Enter an Integer greater than 0");
	}

	public static void secDup(String a, String b, int n) {

		char temp = ' ';
		int count = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			for (int j = 0; j <= b.length() - 1; j++) {
				if (a.charAt(i) == b.charAt(j)) {
					if (count < n && temp != a.charAt(i)) {
						temp = a.charAt(i);
						//System.out.print(temp);
						count = count + 1;
					}

				}
			}
		}

		if (count == 0)
			System.out.println("No duplicates found");
		else if (count == n) {
			System.out.println("Duplicate at" + n + ":" + temp);// to print the second element in the arrayList
		} else if (count < n) {
			System.out.println("pakkaki velli aaduko");
		}
	}

}

//===================================================

//a = a.toLowerCase();
//b = b.toLowerCase();
//if (a.length() <= 1 || b.length() <= 1) {
//	System.out.println("null");
//} else {
//	Set<Character> s = new LinkedHashSet<Character>();
//	List<Character> l = new ArrayList<Character>();
//	for (int i = 0; i <= a.length() - 1; i++) {
//
//		s.add(a.charAt(i));
//	}
//	for (int i = 0; i <= b.length() - 1; i++) {
//
//		if (s.contains(b.charAt(i))) {
//			l.add(b.charAt(i));
//		}
//	}
//
//	if (l.size() >=2) {
//		System.out.println(l.get(1));
//	} else {
//		System.out.println("null");
//	}
//	
//
//}